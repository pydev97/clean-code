# LÊ QUÝ PHÚC
## Khoá học Clean Code - Luvina 2021


## Phần 1: Clean Code căn bản
1. 5 mục tiêu chính của Clean Code là
   - Mục tiêu 1
   - Mục tiêu 2
   - Mục tiêu 3
   - Mục tiêu 4
   - Mục tiêu 5
2. Đáp án của tôi là team C bởi vì:
   -  Lý do 1:Clean code không phải chỉ được nghe giảng, làm vài bài thực hành mà có thể áp dụng được ngay.Hoặc nếu coder mà có áp dụng được vào project thực tế thì cũng chỉ là áp dụng một cách máy móc.Cần thời gian, cần thử thách khi đó mới thấm nhuần được tư tưởng của clean code.
   -  Lý do 2: Nhưng clean code cũng không phải là một cái gì đó quá vi diệu, những cái nào dễ chúng ta nên áp dụng trước ví dụ như quy tắc đặt tên biến, dùng constant,enum,....Những cái khác khó như dùng design parten chẳng hạn có thể nghiên cứu và áp dụng dần dần.
   -  Lý do 3:Cuối cùng là vì sự không hợp lí của 2 team còn lại: team A gặp bất lợi khi project phình to khó, dành thời gian refactor lại code gây tốn thời gian,tiền bạc mà chương trình có thể gây ra nhiều bug degrade, còn team B thì gặp bất lợi là tiến độ chậm -> chậm tiến độ nộp hàng -> khách hàng hẳn sẽ không thích sự thiếu chuyên nghiệp như vậy mặt khác áp dụng clean code ngay ban đầu các thành viên mới vào dự án chưa chắc đã có thể theo kịp.
3. Tôi sẽ trả lời như sau:
   -  Đầu tiên là phải giải thích lí do cần clean code là gì, nêu ra cho họ lợi ích của việc clean code -> 5 lợi ích ở bài 1 phần 1
4. Tôi sẽ chọn phương thức: int calculateSalaryAfterYears(int initialSalary, int NthYear);
5.

## Phần 2: OOP và SOLID
### 1. Hãy lập trình Java để thực hiện thiết kế như hình vẽ
      [GraphicsEditor](https://github.com/pydev97/clean-code/tree/main/GraphicsEditor/src/com/luvina)

### 2. Composition over Inheritance và DI
Gõ link đến mã nguồn bài này vào đây


## Phần 3: Thiết kế CSDL Quan hệ theo đặc tả
      [ảnh thể hiện quan hệ](https://gsviec.com/blog/huong-dan-su-dung-markdown/)
      [File Dummy SQL](https://gsviec.com/blog/huong-dan-su-dung-markdown/)
## Phần 4: Thiết kế RESTful API
1.Entity:User, Teacher, Student
   -  [User](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/entity/User.java)
   -  [Teacher](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/entity/Teacher.java)
   -  [Student](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/entity/Student.java)
   
2.Sử dụng Factory method để khởi tạo đối tượng: gồm 4 thành phần sau:
   -  [Creator](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/service/UserService.java)
   -  [Concreate StudentService](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/service/impl/StudentService.java)
   -  [Concreate TeacherService](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/service/impl/TeacherService.java)
   -  [Product](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/service/UserServiceFactory.java)
   
3.Endpoint của API cần phải phù hợp với các convention đã được học và được đánh version.
   -  [api tạo user](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/resource/UserResource.java)
   
4.Response của API cần ẩn trường password hoặc convert thành ******.
   -  [File config logback](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/resources/logback-spring.xml)
   -  [File config masking parten](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/config/MaskingPatternLayout.java)
   -  [File config log](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/config/LoggingConfiguration.java)
   
5.Tích hợp Swagger để sinh tài liệu cho API.
   -  [File config Swagger](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/config/SwaggerConfig.java)[Truy cập swagger](http://localhost:8080/swagger-ui.html)
   
6.Cần kiểm tra email đã được đăng ký bởi người dùng khác hay chưa.
   *  Throw exception và có cơ chế error handling thích hợp.
   *  Error message trong response body cần rõ ràng, cung cấp các thông tin cần thiết để xác định nguyên nhân lỗi, không chứa thông tin password.
   *  HTTP status code phù hợp.
   -  [Config custom exception](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/error/ServiceRuntimeException.java)
   
7.Cho phép log request body của API nhưng email và password cần được convert thành ******.

## Phần 5: Lập trình Restful API
   1.Tạo entity Course và sử dụng annotation @ManyToOne của Hibernate/Spring Data JPA để mapping quan hệ giữa Course và Teacher.
      -  [Course](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/entity/Course.java)
      -  [Enroll](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/entity/Enroll.java)
      
2.Sử dụng Strategy pattern để cài đặt các thuật toán sắp xếp.
   -  [Strategy](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/service/SortStrategy.java)
   -  [Concreate Strategy Sort by name](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/service/strategy/SortByName.java)
   -  [Concreate Strategy Sort by opened](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/service/strategy/SortByOpened.java)
   
3.RESTful API endpoint cần phải phù hợp với các convention đã được học và được đánh version.
   -  [API](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/resource/CourseResource.java)
   
4.Áp dụng caching cho API để tăng performance.
   -  [Config caching](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/config/CachingConfiguration.java)
   -  [API check kết quả caching](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/resource/CachingController.java)
   
5.Đảm bảo các chức năng của bài tập 2 vẫn hoạt động đúng.
   -  [api tìm kiếm và sort](https://github.com/pydev97/clean-code/blob/main/finalCleanCode/src/main/java/com/luvina/net/LeQuyPhuc_CleanCode/resource/CourseResource.java)
## Trắc nghiệm
    1.C  2.B   3.D   4.C   5.A
    6.A  7.A   8.A   9.B  10.A
    11.D 12.C  13.B  14.A 15.D
    16.B 17.D  18.C  19.D 20.A
    21.A 22.C  23.D 24.A 25.C
    
    
    
    
   
    
    
   
    
    
    
    
   
    
    
    
    
   
    
    25.
