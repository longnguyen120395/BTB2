package OOP.Hinhchunhat;
import java.util.ArrayList;
public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hinhchunhat hcn1 = new hinhchunhat();
		hinhchunhat hcn2 = new hinhchunhat();
		
		hcn1.nhapDulieu();
		System.out.printf("Chu vi hcn là: %.2f\n", hcn1.tinhChuvi());
		System.out.printf("Diện tích hcn là: %.2f\n", hcn1.tinhDientich());
		
		hcn2.nhapDulieu();
		System.out.printf("Chu vi hcn là: %.2f\n", hcn2.tinhChuvi());
		System.out.printf("Diện tích hcn là: %.2f\n", hcn2.tinhDientich());
		
		
	}

}
