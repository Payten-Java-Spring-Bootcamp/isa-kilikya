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

Asagidaki sitedeki yaziyi okudum:
- https://cloud.netapp.com/blog/cvo-blg-high-availability-cluster-concepts-and-architecture

High Availability'e sahip sistemler kesintisiz hizmet verme amaciyle tek bir sistemmis gibi calisan
bir butundur.
Bircok sistemde Single Point of Failure vardir ve eger bu parcada bir ariza meydana gelirse
tum sistem islevsiz hale gelir.

High Availability'e sahip sistemler ise Single Point of Failure'leri cozerek sistemin
parcalarindan birinde bir problem olussa bile sistemin hala ayakta kalmasini saglayabilir.

7. Entity ve Value Object kavramlarını Domain Driven Design (DDD) kapsamında açıklayınız.

Asagidaki sitelerdeki yazilari okudum:
- https://martinfowler.com/bliki/DomainDrivenDesign.html
- https://martinfowler.com/bliki/EvansClassification.html

Entity, "reference objects" de diyebiliriz, kendisine ait ayristirici bir kimligi olan objelerdir.

Value Object ise attribute'lerinin kombinasyonundan olusan ve ayristirici bir kimligi olmayan objelerdir.
Iki Value Object'in attribute degerleri ayniysa bu iki Value Object aynidir diyebiliriz.
Date buna ornek verilebilir; ayni gun ve saati gosteren iki Date objesi aynidir.

8. Ubiquitous Language kavramını DDD kapsamında açıklayınız. Sizce neden önemli olabileceğini belirtiniz.

Asagidaki sitelerdeki yazilari okudum:
- https://martinfowler.com/bliki/UbiquitousLanguage.html
- https://martinfowler.com/eaaCatalog/domainModel.html

Ubiquitous Language, yazilim gelistiricileri ve kullanicilari arasinda ortak bir dil olusturmaya verilen isimdir.
Bu dil Domain Model'e dayali olmalidir.

9. Core Domain, Supporting Domain, Generic Domain kavramlarını DDD kapsamında açıklayınız.

Asagidaki sitelerdeki yazilari okudum:
- https://stackoverflow.com/questions/25274226/ddd-identifying-the-core-domain
- https://stackoverflow.com/questions/15345546/can-core-domain-span-multiple-bounded-contexts
- https://blog.jonathanoliver.com/ddd-strategic-design-core-supporting-and-generic-subdomains/

Ve Eric Evans'in asagidaki sitedeki sunumunu izledim:
- https://www.infoq.com/presentations/strategic-design-evans/

Core Domain, bir yazilim sisteminde o sistemi yapis amaclarimizi kapsayan, 
kendi ekibimiz disinda bir yerden tedarik edemeyecegimiz kisimdir.
Yazilim sistemimizdeki en kaliteli olmasi gereken kisimdir ve sistem Core Domain etrafinda sekillenir.

Supporting Domain, Core Domain kadar kritik olmayan ama Core Domain'den sonra bizim icin en onemli olan kisimdir.
Bu kismi genelde disardan tedarik edemeyiz, kendimiz gelistiririz.

Generic Domain ise yazilim sistemimizin asil amaci olmayan, sisteme yardimci olabilecek kisimlardir.
Bu kisimlari mumkun oldugunca disardan tedarik ederiz. (Hazir olarak veya outsourcing ile.)

10. Anemic Domain Model ve Rich Domain Model kavramlarını kıyaslayarak açıklayınız.

Asagidaki sitedeki yaziyi okudum:
- https://www.amido.com/blog/anaemic-domain-model-vs-rich-domain-model

Anemic Domain Model bazi konularda eksik tasarlanmis Domain Model'leri temsil ediyor,
Rich Domain Model ile Anemic Domain Model'in eksikliklerini tamamlayan cozumler sunuyor.
