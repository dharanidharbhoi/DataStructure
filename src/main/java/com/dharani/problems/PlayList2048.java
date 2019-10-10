package com.dharani.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PlayList2048 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<LinkedList<String>> playlist = new ArrayList<>();	
		
		for(int i = 0 ;i<n;i++) {
			LinkedList<String> songList = new LinkedList<String>();
			int m = sc.nextInt();
			sc.nextLine();
			for(int j=0;j<m;j++) {
				songList.add(sc.nextLine());
			}
			
			int z = sc.nextInt();
			sc.nextLine();
			for(int k=0;k<z;k++) {
				
				songList.remove(sc.nextLine());
			}
			playlist.add(songList);
		}
		
		
		for(LinkedList<String> songList : playlist) {
			songList.forEach(System.out::println);
		}
	}

}
