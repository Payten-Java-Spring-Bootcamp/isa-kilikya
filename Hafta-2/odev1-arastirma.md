# Ödev 1 /Araştırma Soruları

1. Spring dışında dependency injection için kullanabileceğimiz framework’ler / kütüphaneler nelerdir ? (Herhangi bir programlama dili için olabilir.)

Asagidaki sitedeki yaziyi okudum:
- https://www.freecodecamp.org/news/a-quick-intro-to-dependency-injection-what-it-is-and-when-to-use-it-7578c84fa88f/

Birkaç framework örneği:
- Google Guice (Java)
- Dagger (Java and Android)
- Castle Windsor (.NET)
- Unity(.NET)

2. @SpringBootApplication anotasyonu hangi anotasyonları kapsamaktadır ? Görevlerini kısaca açıklayınız.



@SpringBootApplication anotasyonu, @EnableAutoConfiguration, @ComponentScan, @Configuration anotasyonlarini
kapsamaktadir.

@EnableAutoConfiguration: Spring Boot'un auto-configuration mekanizmasini aktiflestirir.
@ComponentScan: uygulamadaki @Component'lerin otomatik taranmasini ve bulunmasini saglamayi aktiflestirir.
@Configuration: icerige yeni bean'larin eklenmesine veya yeni configuration class'larinin import edilmesine izin verir.

3. @Primary, @Qualifier anotasyonlarının kullanım amaçlarını açıklayınız.

Asagidaki sitelerdeki yazilari okudum:
- https://www.baeldung.com/spring-primary
- https://www.baeldung.com/spring-qualifier-annotation

Bu iki anotasyonun çıkış sebebi ortak: container'de aynı tipte birden fazla aynı tipte bean varsa
framework bize NoUniqueBeanDefinitionException fırlatır. Bu karışıklığı çözmek için bu anotasyonları
kullanabiliriz.

@Primary anotasyonu, çakışan bean'lardan hangisinin varsayılan olarak kullanılacağını belirtir.
@Qualifier anotasyonu ise çakışan bean'lara birer etiket atar ve 
ilgili bean kullanılırken etiket değeriyle bağladığımız için hangi bean'ı çağırdığımız belli olur.

4. Convention over configuration kavramını seçtiğiniz bir örnek üzerinden açıklayınız.

Asagidaki sitedeki yaziyi okudum:
- https://docs.spring.io/spring-framework/docs/3.0.0.M3/reference/html/ch16s10.html

CatalogController class'ımız otomatik olarak '/catalog*' request URL'ine mapleniyor.
Normalde olsa bu tür işlemler için xml dosyalarında konfigürasyonlar yapılırdı.
Ancak Spring'te belirli yaklaşımlar izlendiği için herkes konfigürasyonlar yapılmadan da
üretilen yapıları kullanabiliyor.

5. Aspect Oriented Programlama nedir ? Avantajları ve dezavantajları nelerdir ?

Asagidaki sitelerdeki yazilari okudum:
- https://devnot.com/2020/aspect-oriented-programming/
- https://www.baeldung.com/spring-aop

Bir uygulamada security, caching, exception handling, logging gibi işlemler Cross-Cutting Concerns olarak değerlendirilebilir.
Bu tür işlemlerin genel dezavantajları vardır.
AOP faydaları:
- Kod tekrarını önler, başka yerlerde de kullanılabilecek modüler bir yapı elde edilir.
- Kod karmaşası engellenir ve daha okunaklı kodlar elde edilir.
- Projenin bakımı basitleşir.

Ayrıca Spring'te en yaygın kullanılan AOP modülleri, AspectJ ve Spring AOP modülü.

6. SOLID prensiplerini kısaca açıklayınız. Sizce her koşulda bu prensipler çerçevesinde mi kod yazılmalıdır ? Neden ?

Asagidaki sitedeki yaziyi okudum:
- https://dijitalseruven.com/solid-nedir-solid-yazilim-prensipleri-nelerdir/

SOLID prensipler, bir projedeki kodların esnek, sürdürülebilir ve geliştirilebilir tasarlanmasına yardımcı olan prensipler bütünüdür.
SOLID kelimesindeki her bir harf, aslında bir prensibin baş harfidir.

- Single Responsibility Principle:
Her class ve method'un kendine has tek bir sorumluluğu vardır.
- Open Closed Principle: 
Her class geliştirmeye açık olmalı fakat değişime kapalı olmalıdır. 
Bu da genelde abstraction yaparak sağlanır.
- Liskov Substitution Principle: 
Alt sınıflar, üst sınıfların tüm özelliklerini kullanmak zorundadır.
Eğer tüm özellikler kullanılmıyorsa üst sınıf refactor edilebilir, üst sınıfın özelliklerinden bazıları interface'e ayrılabilir.
- Interface Segregation Principle:
Bu prensibe göre her interface'in belirli bir amacı olmalıdır. 
Birçok özelliği kapsayan tek bir interface kullanılmasındansa özelliklerin ayrı ayrı oluşturulduğu birden çok interface kullanmak daha avantajlıdır.
- Dependency Inversion Principle:
Üst seviye sınıflar alt seviye sınıflara bağlı olmamalıdır, ilişki abstraction ile sağlanmalıdır.

7. Swagger nedir, ne amaçla kullanılmaktadır ?

Swagger; API tasarımını, dokümantasyonunu, test etmesini ve geliştirmesini kolaylaştıran bir araçtır.

[Web sitesi](https://swagger.io/)

8. Richardson Maturity Model’i seviyeleriyle birlikte açıklayınız.

Asagidaki sitedeki yaziyi okudum:
- https://blog.burakkutbay.com/richardson-maturity-model-nedir-ve-rmm-seviyeleri.html/

Rest API'larimizin ne seviyede olgun oldugunu gosteren bir olgunluk seviyesidir.
0, 1, 2 ve 3 nolu seviyeler olmak uzere toplamda 4 seviyesi vardir.

9. URL, URI, URN kavramlarını bir örnek üzerinden açıklayınız.

URI; URL ve URN'i de kapsayan bir üst sınıf kurallar bütünüdür.
Uniform Resource Identifier olarak bilinir ve internetteki bir kaynağı tanımlamada kullanılır.

URL, Uniform Resource Locator olarak bilinir ve internetteki bir kaynağın konumunu belirtir. Mesela bu soru için okuduğum yazı kaynağının konumu:

https://stackoverflow.com/questions/4913343/what-is-the-difference-between-uri-url-and-urn

URN(Uniform Resource Name) ise bir kaynağın konumunu değil, ismini belirtir. Mesela bir kitabın ISBN numarası aslında bir URN'dir.

10. Idempotency nedir ? Hangi HTTP metotları idempotent’ tir ?

Asagidaki sitedeki yaziyi okudum:
- https://yigitoguz.com/2019/07/10/http-metotlarinda-idempotent-ve-safe-kavramlari/

Idempotent operasyonlar, bir veya daha fazla kez çalıştırıldığında sonucu değiştirmeyen operasyonlardır.

Options, Get, Head, Put metotları neredeyse her zaman, Delete metodu ise çoğu zaman idempotent'tir. Bu durumlar kodun implementasyonuna göre değişebilir.

11. RFC (Request For Comment) neyi ifade etmektedir ? HTTP hangi RFC dokümanında açıklanmıştır ? Bu dokümanda HTTP hakkında ne tür bilgiler yer almaktadır ?

Online protokollerin, konsept, metot veya programlarin aciklanmasinda kullanilan numaralandirilmis dokumantasyonlardir.

HTTP/1.1, RFC2616'da aciklanmistir.

https://datatracker.ietf.org/doc/html/rfc2616
