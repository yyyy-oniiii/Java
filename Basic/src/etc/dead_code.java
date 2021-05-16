package etc;

    /*
     * dead_code
     */

    public class dead_code {
        public static void main(String[] args) {
            
            //  int num1 = 1;   // Dead Code (선언 후 사용되지 않은 변수)

            int num2 = 2;
            System.out.println(num2);

            if (num2 > 1) {
                System.out.println('T');
            }

            else {                        // Dead Code
                System.out.println('F');  // (조건문의 결과가 항상 'T' 이므로)
            }
        }
        
    }