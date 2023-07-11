package com.kh.day12.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.day12.music.model.vo.Music;


public class MusicView {

	public int MusicMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 메인 메뉴 === ===");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 곡명 내림차순 정렬");
		System.out.println("9. 가수명 오름차순 정렬");
		System.out.println("10. 가수명 내림차순 정렬");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}

	public Music inputMusicInfo() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("곡명 : ");
		String title = sc.nextLine();
		System.out.println("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}
	
	public void displaySuccess(String msg) {
		System.out.println("[서비스 성공]" + msg);
		
	}
	public void displayError(String msg) {
		System.out.println("[서비스 실패]" + msg);
		
	}

	public void showAllMusicList(List<Music> allList) {
		// TODO Auto-generated method stub
		System.out.println("======= 전체 곡 목록 출력 ======");
		int count = 1;
		for(Music music : allList) {
			System.out.printf("%d번째 노래 -> 곡명 : %s, 가수명 : %s\n"
					, count++
					, music.getTitle()
					, music.getSinger());
		}
	}

	public Music inputMusicInfoOne() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("곡명 : ");
		String title = sc.nextLine();
		System.out.println("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}

	public String inputMusicName(String category) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "할 곡 입력 : ");
		String title = sc.nextLine();
		return title; 
		// void는 return과 같이 못쓴다!!! -> 반환해야될 타입 String 대입
	}

	public Music modifyMusicInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("곡명 : ");
		String title = sc.nextLine();
		System.out.println("가수명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		return music;
	}

	public void printMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
}
