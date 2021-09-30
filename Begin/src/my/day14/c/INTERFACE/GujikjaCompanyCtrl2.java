package my.day14.c.INTERFACE;

import java.util.Scanner;

import my.day14.e.INTERFACE.Company;
import my.day14.e.INTERFACE.Gujikja;
import my.day14.e.INTERFACE.InterGujikjaCompanyCtrl;
import my.day14.e.INTERFACE.Member;

public class GujikjaCompanyCtrl2 implements InterGujikjaCompanyCtrl {

	@Override
	public boolean registerGujikja(Scanner sc, Member[] mbrArr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registerCompany(Scanner sc, Member[] mbrArr) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void search(int ageline, Member[] mbrArr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(String gender, Member[] mbrArr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(int ageline, String gender, Member[] mbrArr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAllHopeMoney(Member[] mbrArr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkGujikja(Gujikja gu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkCompany(Company comp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Gujikja login(Scanner sc, Member[] mbrArr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company login(Member[] mbrArr, Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showAll(Member[] mbrArr, int no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAll(Member[] mbrArr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Gujikja update(Scanner sc, Gujikja loginGu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company update(Scanner sc, Company loginComp) {
		// TODO Auto-generated method stub
		return null;
	}

}
