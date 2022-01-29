# Ödev 1 /Araştırma Soruları

1. Concurrent programlama ve Parallel Programlama nedir ? Aralarında çalışma şekli olarak nasıl bir fark
bulunmaktadır ?

Asagidaki sitelerdeki yazilari okudum:
- https://bytearcher.com/articles/parallel-vs-concurrent/
- https://stackoverflow.com/questions/1897993/what-is-the-difference-between-concurrent-programming-and-parallel-programming

Concurrent programlama, tek bir islemciyi daha verimli kullanmak icin uygulanan bir yontemdir. 
Uygulamamizin I/O(Input/Output) islemi yaptigi noktalarda eger kendi sunucumuz disinda bir yerden yanit bekliyorsak,
bu durumda islemci siradaki islemleri yapmaya devam ediyor ve yanit geldiginde diger isleme kaldigi yerden devam ediyor.

Parallel Programlama yapisinda ise ayni anda birden cok isi yapabilmek icin uygulamamizin birden cok islemci cekirdegi
uzerinde calisabilmesine verilen isimdir.

2. Mutex ve Semaphore kavramlarını açıklayınız. Hangi tür durumlarda bunlara başvurmamız gerekir ?

Asagidaki stackoverflow sayfasindaki cevaplari okudum:
- https://stackoverflow.com/questions/771347/what-is-mutex-and-semaphore-in-java-what-is-the-main-difference

Farkli yorumlar oldugu icin cevabimda yanlislar olabilir.

Mutex de Semaphore da bir kaynaga ayni anda kac thread'in erisebilecegini belirlemede kullanilir.
Bir kaynaga tek seferde sadece bir thread'in erisebilmesini saglamak icin Mutex kullaniriz.
Bir kaynaga en fazla kac thread'in erisebilecegini belirlemek icin Semaphore kullaniriz.
Ornegin eger veritabanina ayni anda en fazla 10 connection saglanabilsin dersek burada Semaphore'umuzu 10 yaparak kisit koyabiliriz.

3. Java’da Error ve Exception arasındaki fark nedir ? Throwable ile ilişkileri nasıldır ? Hangi tür durumlarda Error hangi
tür durumlarda Exception meydana gelebilir ? Örneklerler açıklayınız.

Asagidaki sitedeki yaziyi okudum:
- https://techdifferences.com/difference-between-error-and-exception.html

Error'lar, uygulamanin calistigi sistemde yasanan problemlerden kaynaklanir ve 
bir error olusursa uygulama anormal bir sekilde durur.

Exception'lar, uygulamanin kendi kodunda olan problemlerden kaynaklanir ve 
bir exception olusursa try-catch bloklari ile exception handle edilebilir.

Her iki class da Throwable class'inin subclass'laridir.

4. Spring’te yer alan @Scheduled anotasyonunun kullanım amaçlarını ve kullanım şeklini açıklayınız.

Asagidaki sitedeki yaziyi okudum:
- https://www.baeldung.com/spring-scheduled-tasks

@Scheduled anotasyonu sayesinde belirli araliklarla calisacak cron tasklari tanimlayabiliriz.

5. Spring’te yer alan @Async anotasyonunun kullanım amaçlarını ve kullanım şeklini açıklayınız.

Asagidaki sitedeki yaziyi okudum:
- https://www.baeldung.com/spring-async

@Async anotasyonu kullanilan bir bean metodu ayri bir thread uzerinden calisabilir.
Boylece metodu cagiran kisimdaki kodlar bu metodun tamamlanmasini beklemek zorunda kalmaz.

6. High Availability (HA) kavramını kısa açıklayınız.



7. Entity ve Value Object kavramlarını Domain Driven Design (DDD) kapsamında açıklayınız.



8. Ubiquitous Language kavramını DDD kapsamında açıklayınız. Sizce neden önemli olabileceğini belirtiniz.



9. Core Domain, Supporting Domain, Generic Domain kavramlarını DDD kapsamında açıklayınız.



10. Anemic Domain Model ve Rich Domain Model kavramlarını kıyaslayarak açıklayınız.


