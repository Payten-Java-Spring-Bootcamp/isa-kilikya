# Ödev 2 / Kodlama

- Film ve Kullanıcı CRUD endpoint’ lerinin REST pratiklerine uygun olarak yazılması 
(Aşağıdaki 6 maddeye karşılık gelen birer metot yazılacak. Metotlarınızı postman üzerinden test etmeniz tavsiye olunur.)

- MovieController (Fields -> name, genre (enum), releaseYear, director, cast (Liste, oyuncular)
  1. Create -> HTTP 201 Dönecek
  2. GET isteği için HTTP 200 dönecek
  3. DELETE için HTTP 204 dönecek


- MemberController (gerekli field’lar tarafınızdan belirlenecek.)

  4. Kullanıcı filmlere puan verebilecek - member id, movie id, point
  5. Kullanıcılara kendilerine izleme listesi oluşturabilecek (watchlist) - member id, watch list name
  6. Kullanıcılar izleme listelerine film ekleyebilecek - watch list id, movie id

- Controller sınıfındaki metotlar builder ile oluşturulmuş dummy veri dönecek.

- (Bonus) Projeye Swagger entegre edilmesi
