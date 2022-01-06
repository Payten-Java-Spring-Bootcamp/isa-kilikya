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

6. SOLID prensiplerini kısaca açıklayınız. Sizce her koşulda bu prensipler çerçevesinde mi kod yazılmalıdır ? Neden ?

7. Swagger nedir, ne amaçla kullanılmaktadır ?

8. Richardson Maturity Model’i seviyeleriyle birlikte açıklayınız.

9. URL, URI, URN kavramlarını bir örnek üzerinden açıklayınız.

10. Idempotency nedir ? Hangi HTTP metotları idempotent’ tir ?

11. RFC (Request For Comment) neyi ifade etmektedir ? HTTP hangi RFC dokümanında açıklanmıştır ? Bu dokümanda HTTP hakkında ne tür bilgiler yer almaktadır ?
