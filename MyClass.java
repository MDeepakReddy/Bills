package bill;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bill[] bill = new Bill[4];
		for(int i=0;i<4;i++) {
			int bid = sc.nextInt();
			sc.nextLine();
			String btype = sc.nextLine();
			String bstatus = sc.nextLine();
			double bamount = sc.nextDouble();
			bill[i] = new Bill(bid,btype,bstatus,bamount);
		}
		int billid = sc.nextInt();
		sc.nextLine();
		String status = sc.nextLine();
		String res = getBillStatus(bill,billid);
		if(res != null) {
			System.out.println(res);
		}
		else {
			System.out.println("Invalid Id");
		}
		
		double[] res1 = new double[4];
		res1 = getAmountInDesc(bill,status);
		if(res1 != null) {
			for(int i=0;i<res1.length;i++) {
				System.out.println(res1[i]);
			}
		}
		else {
			System.out.println("specified invlaid status");
		}

	}
	
	public static String getBillStatus(Bill[] bill,int billid) {
		int count = 0;
		String st = "";
		for(Bill bl:bill) {
			if(bl.getBillId() == billid) {
				count += 1;
				st = bl.getBillStatus();
			}
		}
		if(count != 0) {
			return st;
		}
		else {
			return null;
		}
	}
	
	public static double[] getAmountInDesc(Bill[] bill,String status) {
		double[] am = new double[4];
		int k = 0,count =0;
		double temp;
		for(Bill b:bill) {
			if(b.getBillStatus().equalsIgnoreCase(status)) {
				count += 1;
				am[k++] = b.getBillAmount();
			}
		}
		for(int i=0;i<am.length;i++) {
			for(int j=i+1;j<am.length;j++) {
				if(am[i]<am[j]) {
					temp = am[i];
					am[i] = am[j];
					am[j] = temp;
				}
			}
		}
		if(count != 0) {
			return am;
		}
		else {
			return null;
		}
	}

}
