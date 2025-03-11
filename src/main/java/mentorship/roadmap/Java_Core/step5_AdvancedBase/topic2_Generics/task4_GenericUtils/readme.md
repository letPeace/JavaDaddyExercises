# Задача "Генерик метод max"

## Описание

Реализуйте класс `GenericUtils` с публичным статическим методом:

- `<T extends Comparable<T>> T max(T a, T b)`, который возвращает большее из двух значений, сравнивая их с помощью
  метода `compareTo`.

В классе `GenericUtilsDemo` протестируйте метод max для чисел и строк.

## Требования

- Файлы: `GenericUtils.java` и `GenericUtilsDemo.java`.