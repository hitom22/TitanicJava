package com.kh.day12.music.run;

import java.util.List;
import java.util.Scanner;

import com.kh.day12.music.controller.MusicController;
import com.kh.day12.music.model.vo.Music;
import com.kh.day12.music.view.MusicView;

public class Run {
	public static void main(String[] args) {
		MusicView view = new MusicView();
		MusicController mController = new MusicController();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Music music = null; // 참조변수 생성
		String title = "";
		int index = 0;
		do {
			choice = view.MusicMenu();
			switch(choice) {
			case 1 : 
				music = view.inputMusicInfo();
				mController.addAtLast(music);
				view.displaySuccess("마지막 위치에 추가 성공!");
				break;
			case 2 : 
				music = view.inputMusicInfoOne();
				mController.addAtZero(music);
				view.displaySuccess("첫 위치에 추가 성공!");
				break;
			case 3 : 
			List<Music> allList = mController.printMusicList();
			view.showAllMusicList(allList);
			view.displaySuccess("첫 위치에 추가 성공!");
				break;
			case 4 :
				title = view.inputMusicName("검색");
				List<Music> searchList = mController.searchMusicByName(title);
				view.showAllMusicList(searchList);
				view.displaySuccess("검색한 " + title + "조회 성공!");
				break;
			case 5 : 
				title = view.inputMusicName("삭제");
				index = mController.searchOneByTitle(title);
				if(index == -1) {
					view.displayError("존재하지 않습니다!");
					break;					
				}
				mController.removeMusic(index);
				view.displaySuccess("곡 삭제 성공!");
				break;					
			case 6 : 
				// 수정할 곡 입력 받기
				title = view.inputMusicName("수정");
				// 존재여부 확인
				index = mController.searchOneByTitle(title);
				if(index == -1) {
					view.displayError("존재하지 않습니다!");
					break;					
				}
				// 이후 수정하기
				// 수정할 정보 입력 받기
				music = view.modifyMusicInfo();
				// 수정하기
				mController.updateMusic(index, music);
				break;
			case 7 : 
				view.printMessage("======== 곡명 오름차순 정렬 =======");
				mController.bubblesortByTitleASC();
				view.displaySuccess("정렬 성공! 3번을 눌러 출력해주세요!");
				break;
			case 8 : 
				view.printMessage("======== 곡명 내림차순 정렬 =======");
				mController.bubblesortByTitleDESC();
				view.displaySuccess("정렬 성공! 3번을 눌러 출력해주세요!");
				break;
			case 9 : 
			view.printMessage("======== 가수명 오름차순 정렬 =======");
			mController.bubblesortBySingerASC();
			view.displaySuccess("정렬 성공! 3번을 눌러 출력해주세요!");
			break;
			case 10 : 
				view.printMessage("======== 가수명 내림차순 정렬 =======");
				mController.bubblesortBySingerDESC();
				view.displaySuccess("정렬 성공! 3번을 눌러 출력해주세요!");
				break;
			case 0 : System.out.println("프로그램을 종료합니다.");
			default : 
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		} while (choice != 0);
	}
}


