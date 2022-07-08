public class BmiService {

    public int calculate(int wight, double height) {
        int result;
        {
            result = (int) (wight / (height * height));
        }
        return result;
    }
}
