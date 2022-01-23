# Ödev 1 /Araştırma Soruları

1. https://martinfowler.com/articles/practical-test-pyramid.html adresindeki yazıyı okuyup özetini çıkarınız.

## The Practical Test Pyramid

"Test Piramidi" uygulamamız gereken test seviyelerini gösteren bir metafordur.

Birçok şirket test otomasyonları sayesinde testleri kolayca çalıştırabiliyor.

### The Importance of Test Automation

Continuous delivery aşamaları var. Şirkette işler büyüdükçe bu aşamaların manuel
yapılması mümkün olmuyor. Bu yüzden testlerin otomasyonlar aracılığıyla çalışması zorunlu oluyor.

### The Test Pyramid

Piramid'in en alttan en üste sıralaması:
- Unit Tests
- Service Tests
- User Interface Tests

Piramidin alt aşamalarında çok test yazmak, üst aşamalarında daha az test yazmak
daha iyi sonuç veriyor.

### Tools and Libraries We'll Look at
JUnit: our test runner
Mockito: for mocking dependencies
Wiremock: for stubbing out external services
Pact: for writing CDC tests
Selenium: for writing UI-driven end-to-end tests
REST-assured: for writing REST API-driven end-to-end tests

### The Sample Application

Bu yazı sırasında yorumlanacak örnek uygulama açıklanmış.

### Unit Tests

Test piramidinin en alt adımıdır. Unit testleri, kodumuzdaki belirli unit'lerin doğru çalıştığından
emin olmak için kullanırız. Buradaki "unit" kelimesinden kasıt genelde bir fonksiyon olmakla beraber,
farklı ortamlarda class için de kullanılabiliyor.

Projemizdeki unit test sayısı diğer testlerden çok daha fazla olmalıdır.

Dış sistemlerle haberleşmeyi Unit Test seviyesinde yapamayacağımız için Mocking kullanırız.

### Integration Tests

Product seviyesindeki neredeyse tüm uygulamalar veritabanları veya diğer servislerle bir şekilde haberleşir.
Bu haberleşmenin test edilmesi için Integration Test'leri kullanılır.

Veritabanı testleri için lokalde farklı bir veritabanı kullanılabilir.
Diğer servislerle haberleşmenin test edilmesi için de Spring için Wiremock kullanılabilir.

### Contract Tests

Consumer-Driven Contract Tests (CDC tests) bir servisi hazırlayan ekibin 
hazırlaması gereken bir test türüdür. Böylece ilgili servisi kullanan servisler
kendi taraflarında haberleşmeyi test edebilir ve CDC testi üzerinden ilgili servisin
güncel olup olmadığını görebilir.

### UI Tests

Günümüzde React, Vue veya Angular üzerinden de unit testler yazılabildiği için bu işler
daha kolay bir şekilde yapılabiliyor. Ancak klasik şekilde Frontend geliştirenler de
Selenium gibi araçlarla UI testlerini gerçekleştirebilirler.

### End-to-End Tests

Selenium gibi araçlarla End-to-End testler gerçekleştirilebilir.

### Acceptance Tests - Do Your Features Work Correctly?

Projenin bir kullanıcının bakış açısından çalışıp çalışmadığının test edilmesine verilen isimdir.

### Explatory Testing

Ne kadar test otomasyon eforu sarf edersek edelim testlerimiz her türlü durumu kapsayamaz.
Bu yüzden manuel olarak bazı uç durumları test etmemiz gerekebilir.

### The Confusion About Testing Terminology

Test terminolojisinde anlaşılamayan bazı noktalar var.
Bunların çeşitli sebepleri olmakla beraber bazen bazı kelimelerin anlamları
farklı kişilerde farklı anlama gelebiliyor.

### Putting Tests Into Your Deployment Pipeline

CI / CD kullanıyorsak bir Deployment Pipeline'ımız vardır.
Otomasyon testlerimizi bu pipeline'a yerleştiririz ve her Deployment öncesi bu testler çalışır.

2. Regression test nedir ? Kısaca açıklayınız.

Asagidaki sitedeki yaziyi okudum:
- https://yazilimtestegitimi.com/regresyon-testi-nedir/

Bir yazilim uzerinde gerekli degisiklikler yapildiktan sonra 
product ortamina tasinmadan once en son yapilan testlerdir.

Sistemdeki kritik noktalarin hala calisip calismadigi test edilir.

3. Black box / white box test kavramlarını açıklayınız.

Asagidaki sitelerdeki yazilari okudum:
- http://gizemgulec.com/2020/04/karakutublackbox-ve-beyazkutuwhitebox-test-teknikleri/
- https://www.beyaz.net/tr/guvenlik/makaleler/black_box_ve_white_box_testi.html

Black box testing yapildiginda bir yazilim sisteminin nasil calistigiyla
ilgilenilmez, onun yerine sisteme giren ve cikan verilere bakilir.
Beklenen girdi ve ciktilar incelenerek sonuclar incelenir.
Black box testing genelde Test Uzmanlari tarafindan gerceklestirilir.

White box testing yapildiginda ise yazilim sisteminin nasil calistigiyla ilgili
yapisal ve tasarimsal duzene uyulup uyulmadigi da test edilir.
White box testing genelde Developerlar tarafindan yapilir.

Ayrica Penetration Testing icin de farkli anlamda kullanilan bir terimdir.

4. Mutation test nedir ? Kısaca açıklayınız.

5. Behavior Driven Development (BDD) nedir, neyi amaçlamaktadır ?

6. Agile test quadrant nedir ? Quadrant’ların kapsamını kısaca açıklayınız.
