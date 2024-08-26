/*import java.util.Scanner; //1 завдання 8 варіант

public class LabTask8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Варіант 1: Вхідні дані дійсного типу, результат – дійсного типу
        System.out.println("Введіть значення x (дійсне число): ");
        double x1 = scanner.nextDouble();
        System.out.println("Введіть значення y (дійсне число): ");
        double y1 = scanner.nextDouble();
        
        double result1 = (2 * Math.pow(x1, 2) + x1 * y1) / Math.pow(x1 * y1, 2) + (3 * x1 * y1 - Math.pow(y1, 3)) / Math.pow(x1, 2);
        System.out.println("Результат (дійсний тип): " + result1);

        // Варіант 2: Вхідні дані цілого типу, результат – дійсного типу
        System.out.println("\nВведіть значення x (ціле число): ");
        int x2 = scanner.nextInt();
        System.out.println("Введіть значення y (ціле число): ");
        int y2 = scanner.nextInt();

        double result2 = (2 * Math.pow(x2, 2) + x2 * y2) / Math.pow(x2 * y2, 2) + (3 * x2 * y2 - Math.pow(y2, 3)) / Math.pow(x2, 2);
        System.out.println("Результат (ціле число -> дійсний результат): " + result2);

        // Варіант 3: Вхідні дані дійсного типу, результат – цілого типу
        System.out.println("\nВведіть значення x (дійсне число): ");
        double x3 = scanner.nextDouble();
        System.out.println("Введіть значення y (дійсне число): ");
        double y3 = scanner.nextDouble();

        int result3 = (int) ((2 * Math.pow(x3, 2) + x3 * y3) / Math.pow(x3 * y3, 2) + (3 * x3 * y3 - Math.pow(y3, 3)) / Math.pow(x3, 2));
        System.out.println("Результат (дійсний тип -> цілий результат): " + result3);

        scanner.close();
    }
}
  */
 /*  import java.util.Scanner;       //2 завдання 1 варіант

  public class Main {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
  
          // Крок 1: Введення розміру масиву
          System.out.print("Enter the size of the array (n <= 200): ");
          int n = scanner.nextInt();
          if (n > 200) {
              System.out.println("Size exceeds the limit of 200.");
              return;
          }
  
          // Крок 2: Введення елементів масиву
          double[] X = new double[n];
          for (int i = 0; i < n; i++) {
              System.out.print("Enter element X[" + i + "]: ");
              X[i] = scanner.nextDouble();
          }
  
          //  Крок 3: Введення інтервалу [a, b]
          System.out.print("Enter the value of a: ");
          double a = scanner.nextDouble();
          System.out.print("Enter the value of b: ");
          double b = scanner.nextDouble();
  
          //Крок 4: Ініціалізація змінних для суми, макс і мін
          double sum = 0;
          double max = Double.NEGATIVE_INFINITY;
          double min = Double.POSITIVE_INFINITY;
          boolean foundInRange = false;
  
          //  // Крок 5: Перебір масиву та обчислення суми, макс і мін для елементів у [a, b]
          for (double value : X) {
              if (value >= a && value <= b) {
                  sum += value;
                  if (value > max) max = value;
                  if (value < min) min = value;
                  foundInRange = true;
              }
          }
  
          // Крок 6: Виведення результатів60

          if (foundInRange) {
              System.out.println("Sum of elements in range [" + a + ", " + b + "]: " + sum);
              System.out.println("Max in range: " + max);
              System.out.println("Min in range: " + min);
          } else {
              System.out.println("No elements found in the range [" + a + ", " + b + "].");
          }
  
          scanner.close();
      }
  }
 */  

/*  import java.util.Scanner;   // 3 завдання 6 варіант 

public class MatrixComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розміру матриць
        System.out.print("Введіть розмір матриць n (n <= 15): ");
        int n = scanner.nextInt();

        // Перевірка розміру матриць
        if (n > 15) {
            System.out.println("Розмір матриці не може перевищувати 15.");
            return;
        }

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[] X = new int[n];

        // Введення елементів першої матриці A
        System.out.println("Введіть елементи матриці A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Введення елементів другої матриці B
        System.out.println("Введіть елементи матриці B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // Порівняння рядків матриць A та B
        for (int i = 0; i < n; i++) {
            boolean isGreater = true;
            for (int j = 0; j < n; j++) {
                if (A[i][j] <= B[i][j]) {
                    isGreater = false;
                    break;
                }
            }
            X[i] = isGreater ? 1 : 0;
        }

        // Виведення результату
        System.out.println("Вектор X:");
        for (int i = 0; i < n; i++) {
            System.out.print(X[i] + " ");
        }
    }
}          
  */
  import java.util.ArrayList;                // 4 завдання 8 варіант 
  import java.util.List;
  import java.util.Scanner;
  
  public class Main {
      public static void main(String[] args) {
          // Створюємо сканер для введення тексту з консолі
          Scanner scanner = new Scanner(System.in);
  
          System.out.println("Enter the text:");
          String text = scanner.nextLine();
  
          // Викликаємо метод для видалення слів непарної довжини
          String result = removeOddLengthWords(text);
  
          // Виводимо результат
          System.out.println("Text after removing odd-length words:");
          System.out.println(result);
      }
  
      public static String removeOddLengthWords(String text) {
          // Розбиваємо текст на слова з урахуванням розділових знаків
          String[] words = text.split("\\s+");
  
          // Використовуємо список для збору слів парної довжини
          List<String> evenLengthWords = new ArrayList<>();
  
          for (String word : words) {
              // Видаляємо розділові знаки на початку та в кінці слова
              String cleanWord = word.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");
  
              // Додаємо слово до списку, якщо його довжина парна
              if (cleanWord.length() % 2 == 0) {
                  evenLengthWords.add(word);
              }
          }
  
          // Об'єднуємо слова назад в рядок
          return String.join(" ", evenLengthWords);
      }
  }
  
  
 


