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

Asagidaki sitedeki yaziyi okudum:
- https://www.javatpoint.com/mutable-and-immutable-in-java

Bir Java class'indan bir instance yaratildiktan sonra bu instance'in field
degerlerinin degistirilememesi durumunda bu class Immutable olur.
Bazi instance'lara yaratildiktan sonra mudahale edilmemesi gerekiyordur, 
mudahale edilirse sistemde ciddi problemler ortaya cikabilir.
Buradaki degisikliklerin onune gecmek icin class Immutable yapilir.

Bir Java class'inin Immutable olabilmesi icin asagidaki ozellikleri saglamasi gerekir:
- final kelimesiyle tanimlanmis final bir class olmasi gerekir ki, yeni bir class uzerinden extend edilemesin.
- Tum alanlar private olmali ki disardan direk erisilemesin.
- Hic Setter olmamasi lazim.
- class'taki tum field'lar final olmali ki, sonradan yapilabilecek bir takim islemlere karsi kendisini koruyabilsin.

3. Framework ve library arasındaki fark nedir ?

Asagidaki sitedeki yaziyi okudum:
- https://www.freecodecamp.org/news/the-difference-between-a-framework-and-a-library-bd133054023f/

Bir proje gelistirirken Framework kullandigimizda Framework bize akisi nasil surdurecegimizi soyler.
Kendi projemizi gelistirirken Framework'un bizden istedigi sartlara uymak zorunda kaliriz.
Uygulamanin akisi buyuk oranda Framework'tedir.

Ama Library kullandigimizda Library bize akisi nasil surdurecegimizi soylemez.
Biz kendimiz bir akis planlariz, mevcut duruma gore Library'nin ozelliklerinden faydalaniriz.

4. Java’da Garbage Collector’ un görevi nedir ?

Asagidaki sitedeki yaziyi okudum:
- https://tugrulbayrak.medium.com/jvm-garbage-collector-nedir-96e76b6f6239

Olusturdugumuz instance'lari bir yere kadar kullaniyoruz.
Bir yerden sonra silmemiz lazim ki bellek temiz kalabilsin.
Jvm'de bulunan Garbage Collector sayesinde hem bellekte yer ayirma islemi hem de bellekte bulunan
ama artik kullanilmayan instance'lari temizleme islemi otomatik olarak yapiliyor.

5. Memory leak nedir ? Java’da memory leak oluşması mümkün müdür ?

Aşağıdaki sitedeki yazıyı okudum:
- https://rollbar.com/blog/how-to-detect-memory-leaks-in-java-causes-types-tools/#

Java uygulamasında yaşam ömrünü tamamlayıp Garbage Collector tarafından temizlenmesi gereken
ama temizlenmeyip RAM'de kalmaya devam eden instance'ların var olması memory leak olması anlamına gelir.

Memory leak olmasının çeşitli sebepleri vardır. Bunlar arasından 3 tanesi:
- Gereksiz seviyede fazla veya yanlış şekilde static field kullanılması.
- connection veya stream'lerin açıldıktan sonra kapatılmaması.
- equals veya hashCode metotlarının hatalı veya eksik kullanımı.

6. Yeni Java sürümleri ne sıklıkla çıkmaktadır ?

2018 yılındaki Java 10 sürümünden itibaren Java sürümleri 6 ayda bir çıkmaktadır.

JavaSE versions history: https://www.codejava.net/java-se/java-se-versions-history

7. Stack ve Heap nedir ? Java’da hangi yapılar stack ile, hangi yapılar heap ile ilişkilidir ?

Asagidaki sitedeki yaziyi okudum:
- https://www.baeldung.com/java-stack-heap

Stack ve Heap, JVM'in RAM'de kullandığı belirli amaçlara hizmet eden alanlardır.
Stack yapısında primitive değişkenler, sabit değerler ve instance referansları tutulur.
Heap yapısında ise diğer instance'lar tutulur.

8. OpenJDK ve OracleJDK arasındaki farklar nelerdir ?

Aşağıdaki sitedeki yazıyı okudum:
- https://www.baeldung.com/oracle-jdk-vs-openjdk

Geçmişte en kararlı sürümler OracleJDK tarafından sunulurmuş ve güncel sürümler de OracleJDK ile gelirmiş.
Ancak günümüzde iki versiyon arasında kararlılık ve performans açısından neredeyse hiç fark kalmamış
ve güncel sürümler OpenJDK tarafından geliyormuş.

OracleJDK sürümleri dönem dönem lisans farkından dolayı kullanım ücretleri almış.

Günümüzde OracleJDK tercih eden kurumlar genelde kurumsal şirketler, bunun en büyük sebebi de
ihtiyaç duyulduğunda Oracle tarafından teknik destek sunulması.

9. @FunctionalInterface anotasyonu nerelerde kullanılabilir, neleri sağlar ?



10. Java’da hangi functional interface’ler yer almaktadır ? Yaptığınız araştırmada en popüler/göze çarpanlar hangileridir ?
