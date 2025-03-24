package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.InventoryService;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.Order;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.OrderRepository;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.OrderService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class OrderServiceTest {
    @Test
    void testOrderProcessingSuccess() {
        // Создаем моки зависимостей
        InventoryService mockInventoryService = mock(InventoryService.class);
        OrderRepository mockOrderRepository = mock(OrderRepository.class);

        // Настраиваем поведение моков
        when(mockInventoryService.isProductAvailable("prod123", 2)).thenReturn(true);

        OrderService orderService = new OrderService(mockInventoryService, mockOrderRepository);
        Order order = new Order("prod123", 2, 50.0);

        // Вызываем метод
        boolean result = orderService.processOrder(order);

        // Проверяем результат
        assertTrue(result);

        // Проверяем вызовы зависимостей
        verify(mockInventoryService, times(1)).isProductAvailable("prod123", 2);
        verify(mockOrderRepository, times(1)).saveOrder(order);
    }

    @Test
    void testOrderProcessingFailure() {
        InventoryService mockInventoryService = mock(InventoryService.class);
        OrderRepository mockOrderRepository = mock(OrderRepository.class);

        when(mockInventoryService.isProductAvailable("prod123", 2)).thenReturn(false);

        OrderService orderService = new OrderService(mockInventoryService, mockOrderRepository);
        Order order = new Order("prod123", 2, 50.0);

        boolean result = orderService.processOrder(order);

        assertFalse(result);

        verify(mockInventoryService, times(1)).isProductAvailable("prod123", 2);
        verify(mockOrderRepository, never()).saveOrder(order);
    }
}
