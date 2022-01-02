# Ödev 2 /Kodlama

- https://martinfowler.com/articles/collection-pipeline/

- Beklenenler (yukarıda yer alan yazıdan)
    - Ana başlıkların birkaç cümleyle özetinin çıkarılması
    - Spring initializr ile bir proje oluşturulması; Lombok ve spring-boot-starter-test dependency’ lerinin eklenmesi
    - Yazıda yer alan operatörlerin Java’daki karşılıklarının bulunup her biri için birer örnek metot yazılması (bazı operatörlerin birebir karşılığı olmayabilir, küçük dokunuşlar yapmak durumunda kalabilirsiniz)
    - (Bonus) Metotlara Junit ile test yazılması


# Summary

## Collection Pipeline

Collection Pipeline'ları birer programlama [pattern](## "model")'idir.
Bu patterne göre bir programlama problemini ele aldığımızda problemi aşamalara ayırırız.
Her bir aşama bir collection alır ve işledikten sonra bir collection döner.

Fonksiyonel programlamada sık kullanılan Collection Pipeline'lar, 
Object Oriented dillere lambda fonksiyonlarla getirilmiş.

## First encounters

Collection Pipeline'ların tarihinden bahsedilmiş.

2000'li yılların başlarında Smalltalk, Ruby gibi dillerde Functional Programming yapısı sayesinde
Collection Pipeline'ların oldukça kullanıldığından, Java gibi OOP dillerde ise sağlıklı kullanım için
altyapının henüz oluşmadığından bahsedilmiş.

## Defining Collection Pipeline

Collection Pipeline aslında bir yazılımı oluştururken 
bu yazılımın parçalara ayrılarak daha akıcı şekilde oluşturulabileceğini
gösteren bir pattern'dir.

OOP dillerde Collection'dan kasıt genelde list, array, set gibi yapılar olur,
functional dillerde ise daha genel tipte yapılar olur.

## Exploring more pipelines and operations

Bu bölümde aşağıdaki data varken Collection Pipeline patterni kullanılarak 
3 yazılım problemine nasıl çözüm üretilebileceği gösterilmiş.

Bu 3 yazılım problemi:
1. Toplam kelime sayısını elde etme (map ve reduce ile)
2. Her tipte kaç article olduğunu bulma (group-by)
3. Her bir etiket için kaç article olduğunu bulma

```
- title: NoDBA
  words: 561
  tags: [nosql, people, orm]
  type: :bliki
- title: Infodeck
  words: 1145
  tags: [nosql, writing]
  type: :bliki
- title: OrmHate
  words: 1718
  tags: [nosql, orm]
  type: :bliki
- title: ruby
  words: 1313
  tags: [ruby]
  type: :article
- title: DDD_Aggregate
  words: 482
  tags: [nosql, ddd]
  type: :bliki
```

## Alternatives

Bu tarz problemlerin çözümünde Collection Pipeline'ların tek çözüm yolu olmadığından bahsedilmiş.
Looplar ve Comprehension'lar kullanılarak da bu problemlerin nasıl çözülebileceğinden bahsedilmiş.
En sonda da neden mümkün oldukça Collection Pipeline'ları kullanmamız gerektiğinden bahsedilmiş.

## Nested Operator Expressions

[Set](## "Küme")'lerle ilgili işlemler için özel ifadeler vardır.
Bu ifadeleri [Nested](## "İç içe") kullanarak birçok işlem kolaylıkla yapılabilir.

Bu tarz durumlarda Collection Pipeline kullanmak süreci uzatabilir.

## Laziness

[Laziness](## "Tembellik") kavramının Fonksiyonel programlama dünyasından geldiğinden bahsedilmiş.

Laziness'i şöyle özetleyebiliriz:

Mesela 10 elemanlı bir listemiz var, aralarından ilk 5'inin maplenmiş haline ihtiyacımız var.
Sadece ilk 5 elemanın maplenip dönmesi sağlanabiliyorsa Laziness'ten bahsedebiliriz.

Sorting gibi işlemlerde tüm elemanların üstünden geçilmek zorunda olduğu için Laziness kullanılamaz.

## Paralellism

Map operasyonları gibi durumlarda genelde işlemler arasında bağ olmadığı için paralel programlama yapılması
performansı artırarak işlem süresini kısaltabilir.

Ancak bazı durumlarda paralel dağıtımı hazırlamak, paralel işlem yürütülmesinin sağladığı faydadan daha fazla
performans düşüklüğüne neden olabilir. Bu yüzden paralelleştirince performansın artıp artmadığı test edilmelidir.

## Immutability

Collection Pipeline'lar genelde en iyi immutable veri yapılarıyla çalışır.
Pipeline sürecinde her aşamada bir collection input alındıktan sonra 
çıktı olarak da yeni bir collection üretilir.

## Debugging

Collection Pipeline'ları debug etmek diğer akışlara göre genelde biraz daha zordur.
Modern IDE'lerdeki breakpoint'ler kullanılarak debugging süreci kolaylaştırılabilir.

## When to Use It

Yazar Collection Pipeline'ı bir pattern olarak görüyor.
Diğer pattern'lerde olduğu gibi, nerede kullanmamız uygunsa orada kullanabiliriz,
ama eğer ki bir durum için başka bir pattern daha uygunsa o zaman diğer pattern'i tercih edebiliriz.

Bazı durumlarda Collection Pipeline pattern'ini kullanmak yorucu olabiliyormuş.
Örneğin bir dilde Collection Pipeline'lar yeterince desteklenmiyorsa,
kendimi o dile uygulamaya çalıştığımızda muhtemelen çok fazla işle ilgilenmek
durumunda kalacağız ve bir süre sonra bu iş sarpa saracak.

Yazar, bazı açık durumlar dışında Collection Pipeline'ları Comprehension'lara tercih edebileceğini söylüyor.
Yine de comprehension'ların kolaylıkla anlaşılabileceği, kısa ve öz bir şekilde yazılabildiği durumlarda
comprehension'ların da kullanılabileceğinden bahsediyor.

Uzun pipeline'ların refactor edilebileceğinden bahsedilmiş. 
Refactor etmeden önce düşünülebilecek bir kural:
Eğer bir kod bloğunun ne yaptığı ve nasıl yaptığı örtüşmüyorsa orada yeni bir method eklenebilir.

## Operation Catalog

Burada Collection Pipeline'lar kullanılırken sık kullanılan bazı operasyonlar listelenmiş:
- collect
- concat
- difference
- distinct
- drop
- filter
- flat-map
- flatten
- fold
- group-by
- inject
- intersection
- map
- mapcat
- reduce
- reject
- select
- slice
- sort
- take
- union
