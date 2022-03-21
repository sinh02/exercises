package Tutorial;

import utils.TextIO;

public class PrintMyAge {
	public static void main(String[] args) {
		TextIO.putf("Mời bạn nhập năm hiện tại: ");
		int namHienTai = TextIO.getlnInt();
		TextIO.putf("Mời bạn nhập năm sinh: ");
		int namSinh = TextIO.getlnInt();
		int tuoi = namHienTai - namSinh;
		TextIO.putln("Tuổi của bạn là: " + tuoi);
	}
}
