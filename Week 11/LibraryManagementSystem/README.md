# Library Management System using Spring Boot

Bir kütüphane yönetim sistemi tasarlamanı istiyoruz. Bu kütüphane sisteminde aşağıdaki entity’ler bulunmaktadır.

Kitap : Kitapların özelliklerini içeren entity/tablo.

Yazar : Yazarların özelliklerini içeren entity/tablo.

Kategori : Kitap kategorilerini içeren entity/tablo.

Yayın Evi : Yayınevlerinin özelliklerini içeren entity/tablo.

Kitap Ödünç Alınması : Kitap ödünç alma işlemlerini izleyen entity/tablo. Bu tablo, ödünç alınan kitabın kim tarafından alındığını, alınma tarihini ve teslim tarihini içerecektir.

Her bir varlık için temel değişkenler aşağıdaki gibidir.

## Kitap (Book):

- id (Benzersiz kitap kimliği)

- name(Kitap adı)

- publicationYear (Yayın yılı)

- stock (Kütüphanedeki miktarı)

## Yazar (Author):

- id (Benzersiz yazar kimliği)

- name (Yazarın adı)

- birthDate (Yazarın doğum yılı)

- country (Yazarın ülkesi)

## Kategoriler (Category):

- id (Benzersiz kategori kimliği)

- name (Kategori adı)

- description (Kategori tanımı)

## Yayınevi (Publisher)

- id (Benzersiz kimliği)

- name (Yayınevi ismi)

- establishmentYear (Kuruluş yılı)

- address (Yayınevi adresi)

## Kitap Ödünç Alma (BookBorrowing)

- id (Benzersiz kimliği)

- borrowerName (Kitap ödünç alan kişi adı soyadı)

- borrowingDate (Kitap ödünç alma tarihi)

- returnDate (Kitabın teslim edildiği tarih, ilk kayıtta null olacak. Kitap teslim edilince tarih güncellenecek)



**Bu varlıklar arasında ki ilişkiler de şu şekilde kurgulandı :**

1. Bir kitabın bir yazarı olabilir, bir yazarın birden fazla kitabı olabilir. (One-to-Many ilişkisi).

2. Bir kategori birden fazla kitaba sahip olabilirken, bir kitap birden fazla kategoriye ait olabilir. (Many-to-Many ilişkisi).

3. Bir kitabın bir yayınevi olabilir, bir yayınevinin birden fazla kitabı olabilir. (One-to-Many ilişkisi).

4. Bir kitap birden fazla ödünç alma işlemine sahip olabilir, ancak her ödünç alma işlemi yalnızca bir kitaba ait olabilir. (One-to-Many ilişkisi).


**Bu ilişkiler sonucunda veritabanımızda oluşan tablolar aşağıdaki gibidir :**

### Kitap ve Kategori sınıfı arasındaki Many to Many ilişki tablosu
> ![](/ss/ss1.PNG)

### Yazar Tablosu
> ![](/ss/ss2.PNG)

### Kitap Tablosu
> ![](/ss/ss3.PNG)

### Kitap Ödünç Alma Tablosu
> ![](/ss/ss4.PNG)

### Kategori Tablosu
> ![](/ss/ss5.PNG)

### Yayınevi Tablosu
> ![](/ss/ss6.PNG)

