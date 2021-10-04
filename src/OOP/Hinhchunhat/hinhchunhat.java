package OOP.Hinhchunhat;
import java.util.Scanner;

public class hinhchunhat {
	double chieuDai;
	double chieuRong;

	
	public hinhchunhat(double chieuDai , double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	
	public hinhchunhat() {
		
	}
	
	public void nhapDulieu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài hcn: ");
		chieuDai = scanner.nextDouble();
		System.out.println("Nhập chiều rộng hcn: ");
		chieuRong = scanner.nextDouble();
		
	}
	
	public double tinhChuvi() {
//		System.out.println("Chu vi hcn là: ");
		double cv = (chieuDai + chieuRong)*2;
		return cv;
	}
	
	public double tinhDientich() {
//		System.out.println("Diện tích hcn là: ");
		double dt = chieuDai * chieuRong;
		return dt;
	}
	
		
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}
	
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	
}