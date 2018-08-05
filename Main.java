public class Main {
    public static void main(String[] args) {
        //      1) Определите ссылку на объект и присвойте ей значение null. Попробуйте вызвать метод объекта, пользуясь этой ссылкой.
        // Поместите данный код в обработчик и перехватите исключение. Какое исключение было выброшено(контролируемое/неконтролируемое) ?
        //      2) Определите класс, который генерирует исключение в одном методе и перехватывает его в другом. Выведите на консоль
        // строковое представление объекта перехваченного исключения. Добавьте предложение finally и распечатайте
        // оттуда сообщение, о том, что объект исключения был перехвачен.
        //      3) Модифицируйте программу, полученную при выполнении предыдущего задания таким образом, чтобы она выбрасывала
        // генерируемое исключение в том же методе. Модифицируйте полученную программу таким образом, чтобы исключение
        // было выброшено только при выполнении некоторого условия, например, при передачи вызываемому методу нулевой
        // ссылки. Всегда ли будет выполняться блок finally? Напишите соответствующий код, доказывающий Ваш ответ.
        //      4) Намеренно смоделируйте ситуации: a) переполнения стека      b) нехватки памяти в куче

        Students students = new Students();

        // Task 1
        students.addingStudents(); // NullPointerException

        // Task 2
        try{
            students.deletingStudents();
        } catch (NullPointerException e){
            System.out.println("Again the same problem - " + e);
        } finally {
            System.out.println("Exception object was successfully caught.");
        }

        // Task 3
        try{
            students.settingNewStudent();
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Finally is always performed.");
        }

        // Task 4
        students.countingStudents(); // StackOverFlow

        // Task 4.2
        students.heapMemory(); // OutOfMemoryError
    }


}
