# Подсказка

- Метод `computeIfAbsent()` позволяет сократить проверку на null:

```  
map.computeIfAbsent(length, k -> new ArrayList<>()).add(word);
```