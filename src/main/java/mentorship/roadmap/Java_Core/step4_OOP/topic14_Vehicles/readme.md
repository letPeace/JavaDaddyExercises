# Задача "Транспорт и Автомобиль"

## Описание

Дан абстрактный класс `Transport`, в котором:

- Поле `model`
- Абстрактный метод `move()`
- Метод `printInfo()` — выводит `model`

Создайте класс `Engine`:

- Поле `horsePower` и статический счётчик `engineCount`
- Метод `getHorsePower()` и `getEngineCount()`

Создайте класс `Car`, который:

- Наследует `Transport`
- Имеет поле `Engine engine`
- Конструктор принимает `model` и `engine`, вызывает `super(model)`
- Реализует `move()` — выводит `"Автомобиль <model> едет с мощностью <hp> л.с."`

В `main()`:

- Создайте два двигателя и две машины
- Выведите `engineCount`

## Требования

- Файлы: `Transport.java`, `Engine.java`, `Car.java`
