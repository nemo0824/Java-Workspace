package com.kh.chap01_poly.part02_electronic.model.vo;

public class NoteBook extends Electronic{
	private int usbPort;

	public NoteBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand, name, price);
		this.usbPort = usbPort;
		// TODO Auto-generated constructor stu1b
	}

	public int getUsbPort() {
		return usbPort;
	}

	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}

	@Override
	public String toString() {
		return "NoteBook [usbPort=" + usbPort + ", toString()=" + super.toString() + "]";
	}
	
	
}
