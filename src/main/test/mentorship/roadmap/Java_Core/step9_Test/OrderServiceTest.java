package mentorship.roadmap.Java_Core.step9_Test;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.InventoryService;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.Order;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.OrderRepository;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
    @Mock
    private InventoryService inventoryService;
    @Mock
    private OrderRepository orderRepository;
    @Mock
    private Order order;
    @InjectMocks
    private OrderService orderService;

    @Test
    public void successProcessOrder() {

        when(inventoryService.isProductAvailable(order.getProductId(), order.getQuantity())).thenReturn(true);

        assertTrue(orderService.processOrder(order));

        verify(orderRepository, Mockito.times(1)).saveOrder(order);
        verify(inventoryService, Mockito.times(1)).isProductAvailable(order.getProductId(), order.getQuantity());

    }

    @Test
    public void failedProcessOrder() {

        when(inventoryService.isProductAvailable(order.getProductId(), order.getQuantity())).thenReturn(false);

        assertFalse(orderService.processOrder(order));

        verify(inventoryService, Mockito.times(1)).isProductAvailable(order.getProductId(), order.getQuantity());

        verify(orderRepository, never()).saveOrder(order);

    }

}
