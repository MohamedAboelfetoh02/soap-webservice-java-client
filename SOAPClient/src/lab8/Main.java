/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            MyService_Service service = new MyService_Service();
            MyService port = service.getMyServicePort();

            int sum = port.addNumbers(5, 7);
            System.out.println("Sum: " + sum);

            List<Double> sequence = port.generateLogSequence(10, 1, 3);
            List<Double> disturbed = port.disturbSequence(sequence, 0.1);

            System.out.println("\nGenerated Points:");
            for (int i = 0; i < sequence.size(); i++) {
                System.out.printf("%d: %.4f    disturbed: %.4f%n", i + 1, sequence.get(i), disturbed.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
