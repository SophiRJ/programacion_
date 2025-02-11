public class Operaciones {
        private int num1;
        private int numero2;

        public Operaciones(int num1, int num2) {
            this.num1 = num1;
            this.numero2 = num2;
        }
        public int suma(){
            return num1+numero2;
        }
        public int multi(){
            return num1*numero2;
        }
        public int divi(){
            return num1/numero2;
        }
        public int resta(){
            return num1-numero2;
        }

        public int getNum1() {
            return num1;
        }

        public void setNum1(int num1) {
            this.num1 = num1;
        }

        public int getNum2() {
            return numero2;
        }

        public void setNum2(int num2) {
            this.numero2 = num2;
        }

}
