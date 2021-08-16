package com.app;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.app.businessException.BusinessException;
import com.app.model.Player;
import com.app.search.service.SearchService;
import com.app.search.service.Imp.SearchServiceImp;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Logger log = Logger.getLogger(Main.class);

		log.info("Welcome Here");
		log.info("What you want to do this time?");
		log.info("**********************************");
		int ch = 0;
		do {
			log.info("1) Create Player");
			log.info("2) Update Player");
			log.info("3) Delete Player");
			log.info("4) List All Player");
			log.info("5) Search player by filter");
			log.info("6) Exit");

			log.info("Enter your choice between 1-6");
			try {
				ch = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				log.info("Entry is not appropriate. Please Enter Valid Choice\n\n");
			}
			switch (ch) {
			case 1:
				log.info("Work Under Construction");
				break;
			case 2:
				log.info("Work Under Construction");
				break;
			case 3:
				log.info("Work Under Construction");
				break;
			case 4:
				log.info("Work Under Construction");
				break;
			case 5:
				do {
					log.info(
							"\n*****Welcome to Player Search filter menu. Search your player by following filter*****");
					log.info("1)By Id");
					log.info("2)By Name");
					log.info("3)By Sports Name");
					log.info("4)By city");
					log.info("5)By contact");
					log.info("6)By TeamID");
					log.info("7)By Gender");
					log.info("8)By Age");
					log.info("9)Back to Main Menu");

					try {
						ch = Integer.parseInt(scanner.nextLine());
					} catch (NumberFormatException e) {
						log.info("Entry is not appropriate. Please Enter Valid Choice\n\n");
					}

					switch (ch) {
					case 1:
						log.info("Enter player id :");
						int id = 0;
						try {
							id = Integer.parseInt(scanner.nextLine());
						} catch (NumberFormatException e) {
							log.info("id is not appropriate.\n\n");
						}

						SearchService searchService = new SearchServiceImp();
						try {
							Player player = searchService.getPlayerById(id);
							if (player != null) {
								log.info("Player Information is :\n");
								log.info(player);
							}
						} catch (BusinessException e) {
							log.error(e.getMessage());
						}
						break;
					case 2:
						log.info("Work Under Construction 1");
						break;
					case 3:
						log.info("Work Under Construction 1");
						break;
					case 4:
						log.info("Work Under Construction 1");
						break;
					case 5:
						log.info("Work Under Construction 1");
						break;
					case 6:
						log.info("Work Under Construction 1");
						break;
					case 7:
						log.info("Work Under Construction 1");
						break;
					case 8:
						log.info("Work Under Construction 1");
						break;
					case 9:
						log.info("\n****Main Menu*******");
						break;
					}

				} while (ch != 9);
				break;
			case 6:
				log.info("Thanks for using our app. Nice to meet you! ");
				break;
			default:
				log.warn("Please enter valid choice (1-6)");
			}
		} while (ch != 6);

	}

}
