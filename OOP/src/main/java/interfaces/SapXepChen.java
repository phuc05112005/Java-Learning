package interfaces;

public class SapXepChen implements SapXepInterface {

    @Override
    public void sapXepTang(double[] arr) {

        for (int i = 1; i < arr.length; i++) {

            double key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    @Override
    public void sapXepGiam(double[] arr) {

        for (int i = 1; i < arr.length; i++) {

            double key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}