# Ödev / Araştırma Soruları

1. Conway’in Kanunu’ nu (Conway’s Law) açıklayınız.

Asagidaki kaynaklardaki yazilari okudum:
- http://www.melconway.com/Home/Conways_Law.html
- https://www.thoughtworks.com/insights/blog/demystifying-conways-law

Conway, 1967 yilinda bir yazisinin Harward Business Review'de yayinlanmasini istemis.
Ancak yazidaki teorilerin dogrulugunun kanitlanmamasindan dolayi reddedilmis.

Sonrasinda bu yazi Datamation isimli bir dergide yayinlanmis.
Yayinlandiktan sonra ekosistemde otoritesi olan bircok insan gormus ki gercekten buyuk oranda haklilik payi var.

Peki Conway bu yazisinda ne demek istemis? Aslinda kendisi yazilim takimlarinda calisirken bunu farketse de,
deneyimledigi bircok sirketteki sistemlerin ne kadar saglikli oldugunu sirket calisanlari arasindaki iletisim
belirliyor. Ekipler kendileri arasinda yeterli iletisimi kuramazsa her ekip kendi yapisina gore hareket ediyor,
bunun sonucunda da sistemler yanlis yonde gelistirilerek yikip yeniden yapilmasi gereken sistemlere donusuyor.

Ancak ekipler arasindaki iletisim saglikli olursa, sirketin gelistirdigi sistem de o kadar saglikli oluyor.

2. Software as a Service (SaaS), Platform as a Service (PaaS), Infrastructure as a
Service (IaaS), On-Premises kavramlarını örneklerle açıklayınız.

Asagidaki kaynaktaki yaziyi okudum:
- https://www.ibm.com/cloud/learn/iaas-paas-saas

SaaS, PaaS, IaaS ve On-Premise kavramlari aslinda bir yazilim sisteminin servis edilmesinde
hangi sorumlulugun ne tarafta oldugunun acikliga kavusturulmasinda kullaniliyor.

Mesela bir sirket kendi is ihtiyaclari icin bir yazilim istese, bu yazilimin calisabilmesi icin
gereken donanimin hepsini kendisi alsa, bir IT ekibi kursa, bu donanimda calisacak yazilim icin de yazilim
ekibi kursa ve yazilim bu sekilde calissa, bu durumda sistem On-Premise olur.

Ancak eger donanimi kendisi almasa da bir Cloud Provider'den kiralama yoluyla tedarik etseydi bu durumda
sistem, Infrastructure as a Service (IaaS) olurdu. Cunku Infrastructure bir servis olarak tedarik edilmis olurdu.

Eger sirket IT ekibi de calistirmasa, IT ekibinin yapabilecegi islemleri de saglayan bir Cloud Servisi kullansaydi
bu durumda kullandigi sistem PaaS olurdu.

Eger sirket yazilimi da gelistirmese ve hazir bir yazilim kullansaydi da bu durumda kullandigi yazilim
bir Software as a Service (SaaS) olurdu.

3. Continuous Integration, Continuous Delivery ve Continuous Deployment
kavramlarını açıklayınız.

Asagidaki kaynaklardaki yazilari okudum:
- https://docs.aws.amazon.com/codepipeline/latest/userguide/concepts-continuous-delivery-integration.html
- https://aws.amazon.com/devops/continuous-delivery/

Continuous Integration, gelistiricilerin yaptiklari gelistirmelerini bir version control
araci ile entegre etmeleri icin kullandigi bir gelistirme pratigidir.
Continuous Integration pratiginin uygulanabilmesi icin kod uzerinde building ve testing islemlerinin
uygulanmasi gerekir. Boylece gelistiriciler kodda bir problem varsa erken asamada fark edebilir.

Continuous Delivery ise Continuous Integration ve sonrasinda kodun Product ortamina cikana kadar
izledigi yolun tamamini kapsar. Continuous Integration surecleri tamamlandiktan sonra kod 
test ortamina deploy edilir ve cesitli testler burada saglanir. Hicbir problem gozlenmezse 
kodun Product ortamina deploy edilmesine kadar gelinir. Continuous Delivery'de kod otomatik olarak
Product ortamina deploy edilmez, genelde bir gelistirici(insan) tarafindan onaylanarak deploy edilir.

Continuous Deployment'te ise Continuous Delivery sureci bittikten sonra son kontroller de
sistem tarafindan yapilir ve kod Product ortamina cikar.

4. API Gateway pattern’ı açıklayınız.

Asagidaki kaynaklardaki yazilari okudum:
- https://aws.amazon.com/api-gateway/
- https://microservices.io/patterns/apigateway.html

Hayatimiza Microservice Architecture'in girmesiyle beraber client tarafindan server 
tarafina istek atmak karmasiklasti. API Gateway sayesinde client'lar sanki backend tarafinda
tek bir server varmis gibi API Gateway'e istek atiyor, arka plandaki request yonetimini ve
daha bir cok fonksiyoneliteyi API Gateway sagliyor.

5. Backend for frontend (BFF) pattern’ ı açıklayınız.

Asagidaki kaynaktaki yaziyi okudum:
- https://microservices.io/patterns/apigateway.html

Her bir Client(Frontend) turu icin ayri ayri API Gateway kullanilmasina Backend for Frontend deniyor.
Mesela Web Application tipinde client'lar icin ayri bir API Gateway,
Mobile Application tipinde client'lar icin ayri bir API Gateway,
3rd Party Application tipinde client'lar icin ayri bir API Gateway olusturulabilir.

Bunun en onemli sebebi, client'larin Backend tarafindan istedikleri data ve bekledikleri
teknolojinin farkli olabilmesi.

6. Circuit-breaker pattern’ ı açıklayınız.

Asagidaki kaynaktaki yaziyi okudum:
- https://docs.microsoft.com/en-us/azure/architecture/patterns/circuit-breaker

Mesela bir backend servisimiz var diyelim. Bir de bu servisten çağırdığımız 
external(harici) bir servis olsun. Bazı durumlarda bu external servis fail olabiliyorsa 
buna karşı bir önlem olarak Circuit Breaker Pattern'i kullanabiliriz.

Circuit Breaker Pattern'e göre 3 state(state machine şeklinde) var. Bunlar: 
Closed, Open, Half-Open. Eğer ki external servisimiz çalışıyorsa ve bir sıkıntı yoksa 
Circuit Breaker'imiz Closed state'inde olur. Eğer external servisimiz fail olursa 
Circuit Breaker'imiz Open state'inde olur, ve belirli aralıklarla Half-Open state'ine geçerek
external servisin eski haline gelip gelmediğini kontrol eder.

7. Microservice chassis pattern’ ı kısaca açıklayınız.

Asagidaki kaynaktaki yaziyi okudum:
- https://dzone.com/articles/ms-chassis-pattern

Biz uygulamamiz icin cesitli microservice'ler yazarken cross-cutting concern'ler icin 
her serviste ister istemez benzer kodlar yaziyoruz. Buradaki cross-cutting concern'leri 
servislerimizden ayirarak ayri bir serviste yazsaydik hem kod coklamasinin onune gecmis olurduk, 
hem de cross-cutting concern'lerle ilgili bir degisiklik yaptigimizda tum servislerde guncelleme 
yapmak zorunda kalmazdik.
