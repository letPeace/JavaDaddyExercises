# Задача "Producer-Consumer с wait/notify"

## Описание

Создайте класс с общим буфером (например, List<Integer>), к которому обращаются два типа потоков:

- Producer: генерирует целые числа и добавляет их в буфер.
- Consumer: извлекает числа из буфера и выводит их.
  Используйте методы wait() и notifyAll() для синхронизации доступа к буферу.

В классе `ProducerConsumerDemo`:

- Запустите один Producer и один Consumer.
- Ограничьте размер буфера (например, 5 элементов).

## Требования

- Файлы: ProducerConsumerDemo.java.
