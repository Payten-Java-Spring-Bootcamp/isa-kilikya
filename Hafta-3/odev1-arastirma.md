# Ödev 1 /Araştırma Soruları

1. Imperative Programming ve Declarative Programming kavramlarını kısaca açıklayıp farklarını belirtiniz.

Asagidaki sayfadaki bircok cevabi okudum:
- https://stackoverflow.com/questions/1784664/what-is-the-difference-between-declarative-and-imperative-paradigm-in-programmin

Imperative Programming yaptigimizda bir problemi nasil cozecegimizi belirtiyoruz.
Ne yaptigimizi koda bakar bakmaz anlayamiyoruz, sureci takip ederek anlamaya calisiyoruz.

Declarative Programming yaptigimizda bir problemi nasil cozecegimizi neredeyse hic belirtmiyoruz,
hangi problemi cozmek istedigimizi belirtiyoruz.
Bu tur durumlarda genelde ne yapildigini koda bakar bakmaz anlayabiliyoruz.

2. Veri tabanlarının sorgu optimizasyonlarında index oluşturmanın avantajı nedir ? 
Sık index kullanmak bir probleme yol açar mı?

Asagidaki sitedeki yaziyi okudum:
- https://dataschool.com/sql-optimization/how-indexing-works/

Primary key'i olan her tablonun bir clustered index'i vardir. Istersek biz diger sutunlar icin de non-clustered index olusturabiliriz.
Index olusturmak, index olusturulan sutun uzerinde yapilan sorgulari hizlandirir.

Sik index kullanmak avantajli bir durum degildir. Her index olusturdugumuzda veritabaninda yer kaplayan bir bilgi olustururuz.
Ayrica ilgili tabloya her write islemi yapildiginda index'in guncellenmesi de zaman alacaktir.
Bu yuzden yalnizca gercekten performans iyilestirmesine ihtiyac duydugumuz yerlerde yeni index'ler eklemeliyiz.


3. İlişkisel veritabanları için normalizasyon kavramı neyi ifade etmektedir ? İlk 3 normal formu örnek üzerinden
açıklayınız.

Asagidaki sitedeki yaziyi okudum:
- https://www.studytonight.com/dbms/database-normalization.php

Database Normalization, veritabanindaki verileri organize etmek icin bir tekniktir. 
Veri tekrarini ve insertion, update ve deletion gibi islemlerde olabilecek anomalileri onlemeye yardimci olur.

Normalization Formlari:
1- First Normal Form (1NF)
- Her sutunda tek bir deger bulunmali.
- Her sutundaki degerler kendi sutununa uygun olmali ve veri tipleri ayni olmali.
- Sutun isimleri birbirinden farkli olmali.
- Sutunlarin sirasi onemli degil.
2- Second Normal Form (2NF)
3- Third Normal Form (3NF)
4- Boyce and Codd Normal Form (BCNF)
5- Fourth Normal Form (4NF)

4. ORM kütüphaneleri kullanmak her zaman avantajlı mıdır ? ORM kütüphanelerinin ne gibi dezavantajları olabilir ?

ORM kutuphaneleri kullanmak neredeyse her zaman daha avantajlidir.
Ancak bazi durumlarda ORM kutuphanesi yerine native SQL kullanilabilir.
Bu durumlardan ikisi sunlardir: ORM'in karsilayamadigi performans kaynakli ihtiyaclarin olmasi ve ORM ile istenen seyin saglanamamasi.

5. Domain Specific Language (DSL) kavramını açıklayınız.

Asagidaki sitedeki yaziyi okudum:
- https://www.jetbrains.com/mps/concepts/domain-specific-languages/

Asagidaki sitede de DSL ornekleri var:
- https://tomassetti.me/domain-specific-languages/

Domain Specific Language'ler, belirli bir domain(alan)'deki problemleri soyutlamak icin gelistirilen dillerdir.
DSL diller, kendi domain'indeki konsept ve kurallari kullanir.

6. Long lived transaction kavramı hangi tip transactionları ifade etmektedir ? Dezavantajları var mıdır ? Varsa nelerdir ?

Asagidaki sitelerdeki yaziyi okudum:
- https://en.wikipedia.org/wiki/Long-lived_transaction
- https://stackoverflow.com/questions/1968437/are-long-living-transactions-acceptable

Birden fazla transaction'in atomik olarak gerceklestirilmesine verilen isimdir.
Veritabaninda lock'lar yarattigi icin yavaslama yapabilir.

7. Thread Pool nedir ? Nerelerde kullanılır ?

Thread yonetiminde kullanilan bir yontemdir. Belirli miktarda Thread yeni isler almak icin hazir bekler.
Sirada yeni isler oldukca bu Threadler bu isleri alarak bitirir.

Spring'te de Thread Pool yapisi kullaniliyor. Kullanim alanlari arasinda veritabani baglantilari da bulunuyor.
Thread Pool kisitindan dolayi veritabanina kisa ve oz query'ler atmaya ozen gosteririz.
Yani ayni isi bir query ile yapabiliyorsak yirmi tane query atmamaliyiz.

8. Scalability nedir ? Horizontal ve Vertical Scalability kavramlarını açıklayınız.

Bir sistemin scalability'si, sistemin artan is yukunu yonetebilme kapasitesidir.

Sistemin artan is yukunu karsilayabilmesi icin kaynak artirimina gitmesi gerekir.
Bu kaynaklar Horizontal veya Vertical olarak olceklenebilir.

#### Horizontal Scalability
Uygulamamizin calistigi sanal veya fiziksel makine sayisini artirdigimizda Horizontal Scaling yapmis oluruz.

#### Vertical Scalability
Uygulamamizin calistigi sanal veya fiziksel makinelere daha fazla kaynak(ram, disk, cpu vs.) verirsek 
burada Vertical Scaling yapmis oluruz.

9. Data replication ve sharding nedir ? Aralarında nasıl bir fark bulunmaktadır ?

Data replication, database'in coklanmasidir. 
Relational Database sistemlerinde bir veritabanindan write islemleri yapilirken birden cok veritabanindan da read islemi yapilarak performans artirilabilir.

Data sharding ise veritabaninin query performansini artirmak icin daha kucuk parcalara ayrilmasi islemidir.
