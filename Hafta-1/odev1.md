# Ödev 1 /Araştırma Soruları

1. Pass by value, pass by reference kavramları nedir ? Java’ ile ilişkili olarak açıklayınız.
Asagidaki 2 Stack Overflow yorumunu okudum:
- https://stackoverflow.com/a/40523/11953327
- https://stackoverflow.com/a/73021/11953327

Java pass-by-value bir dildir. Metotlarin aldigi parametreler aslinda referanslarin kendisi degil,
referanslarin gosterdigi degerlerdir. Burada ornek verecek olursak metoda gecilen deger ornegin "apple" referansi degil de, bu referansin gosterdigi instance'in RAM'de bulundugu konumdur, yani mesela 42'dir. Dolayisiyla referansin gosterdigi degerdeki instance uzerinde degisiklik yapilirsa instance'in degerleri degistirilebilir.
```java
public static void myMethod(Apple apple) {
    apple.setColor("Yellow");
}

Apple apple = new Apple("Red");
myMethod(apple);
System.out.println(apple.getColor()); // prints "Yellow"
```
Ancak referansin gosterdigi degere yeni bir instance atanirsa o zaman metodun cagirildigi yerdeki instance uzerinde bir degisiklik olmaz.
```java
public static void myMethod(Apple apple) {
    apple = new Apple("Yellow");
}

Apple apple = new Apple("Red");
myMethod(apple);
System.out.println(apple.getColor()); // prints "Red"
```

2. Immutability nedir, neden önemlidir ? Bir Java sınıfı nasıl immutable yapılır ?

3. Framework ve library arasındaki fark nedir ?

4. Java’da Garbage Collector’ un görevi nedir ?

5. Memory leak nedir ? Java’da memory leak oluşması mümkün müdür ?

6. Yeni Java sürümleri ne sıklıkla çıkmaktadır ?

7. Stack ve Heap nedir ? Java’da hangi yapılar stack ile, hangi yapılar heap ile ilişkilidir ?

8. OpenJDK ve OracleJDK arasındaki farklar nelerdir ?

9. @FunctionalInterface anotasyonu nerelerde kullanılabilir, neleri sağlar ?

10. Java’da hangi functional interface’ler yer almaktadır ? Yaptığınız araştırmada en popüler/göze çarpanlar hangileridir ?
