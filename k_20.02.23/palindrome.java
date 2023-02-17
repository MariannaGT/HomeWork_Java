
//// 1. Создать метод, который проверяет, является ли строка палиндромом.
// Палиндром - шалаш

    public class palindrome {
	
        /**
         * @param args
         */
        public static void main(String[] args) {
            String str = "шалаш";
            StringBuilder sb = new StringBuilder("шалаш");
            
            sb.reverse();
            
            if (str.equals(sb.toString())) {
                System.out.println("Строка является палидромом!");
            } else {
                System.out.println("Строка не является палидромом!");
            }
        }
    
    
    }
    