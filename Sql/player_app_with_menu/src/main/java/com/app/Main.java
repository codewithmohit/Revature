package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.app.businessException.BusinessException;
import com.app.model.Player;
import com.app.search.service.SearchService;
import com.app.search.service.Imp.SearchServiceImp;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
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
				log.info("Entry is not appropriate. Please Enter Valid Choice\n");
				continue;
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
				int option = 0;
				SearchService searchService = new SearchServiceImp();

				do {
					log.info(
							"\n*****Welcome to Player Search filter menu. Search your player by following filter*****");
					log.info("1)By Id");
					log.info("2)By Name");
					log.info("3)By Sports Name");
					log.info("4)By city");
					log.info("5)By contact");
					log.info("6)By TeamName");
					log.info("7)By Gender");
					log.info("8)By Age");
					log.info("9)Back to Main Menu");

					try {
						option = Integer.parseInt(scanner.nextLine());
					} catch (NumberFormatException e) {
						log.info("Entry is not appropriate. Please Enter Valid Choice\n");
						continue;
					}

					switch (option) {
					case 1:
						log.info("Enter player id to find your Player");
						try {
							int id = Integer.parseInt(scanner.nextLine());
							Player player = searchService.getPlayerById(id);
							if (player != null) {
								log.info("Player Information is :\n");
								log.info(player);
							}
						} catch (NumberFormatException e) {
							log.info("Player Id should be digit only... Try Again\n\n");
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 2:
						log.info("Enter Player Name to find your Player");

						String name = scanner.nextLine();
						List<Player> playerListByName = new ArrayList<>();
						try {
							playerListByName = searchService.getPlayerByName(name);
							if (playerListByName != null && playerListByName.size() > 0) {
								log.info("The total no. of Player of this name " + name + " in Database is "
										+ playerListByName.size() + " and details are below\n");
								for (Player player : playerListByName) {
									log.info(player);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 3:
						log.info("Enter Sports Name to find your Player");

						String sportsName = scanner.nextLine();
						List<Player> playerListBySportsName = new ArrayList<>();
						try {
							playerListBySportsName = searchService.getPlayerBySportsName(sportsName);
							if (playerListBySportsName != null && playerListBySportsName.size() > 0) {
								log.info("The total no. of Player of this Sports " + sportsName + " in Database is "
										+ playerListBySportsName.size() + " and details are below\n");
								for (Player player : playerListBySportsName) {
									log.info(player);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 4:
						log.info("Enter City to find your Player");

						String city = scanner.nextLine();
						List<Player> playerListByCity = new ArrayList<>();
						try {
							playerListByCity = searchService.getPlayerByCity(city);
							if (playerListByCity != null && playerListByCity.size() > 0) {
								log.info("The total no. of Player of this city " + city + " in Database is "
										+ playerListByCity.size() + " and details are below\n");
								for (Player player : playerListByCity) {
									log.info(player);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 5:
						log.info("Enter player contact no. to find your Player");
						try {
							long contact = Long.parseLong(scanner.nextLine());
							Player player = searchService.getPlayerByContact(contact);
							if (player != null) {
								log.info("Player Information is :\n");
								log.info(player);
							}
						} catch (NumberFormatException e) {
							log.info("Player Contact no. should be digit only... Try Again\n\n");
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 6:
						log.info("Enter Team Name to find your Player");

						String teamName = scanner.nextLine();
						List<Player> playerListByTeamName = new ArrayList<>();
						try {
							playerListByTeamName = searchService.getPlayerByTeamName(teamName);
							if (playerListByTeamName != null && playerListByTeamName.size() > 0) {
								log.info("The total no. of Player of this name " + teamName + " in Database is "
										+ playerListByTeamName.size() + " and details are below\n");
								for (Player player : playerListByTeamName) {
									log.info(player);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 7:
						log.info("Enter Gender to find your Player");

						String gender = scanner.nextLine();
						List<Player> playerListByGender = new ArrayList<>();
						try {
							playerListByGender = searchService.getPlayerByGender(gender);
							if (playerListByGender != null && playerListByGender.size() > 0) {
								log.info("The total no. of Player of this gender " + gender + " in Database is "
										+ playerListByGender.size() + " and details are below\n");
								for (Player player : playerListByGender) {
									log.info(player);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 8:
						log.info("Enter Player Age to find your Player");

						int age = Integer.parseInt(scanner.nextLine());
						List<Player> playerListByAge = new ArrayList<>();
						try {
							playerListByAge = searchService.getPlayerByAge(age);
							if (playerListByAge != null && playerListByAge.size() > 0) {
								log.info("The total no. of Player of this age " + age + " in Database is "
										+ playerListByAge.size() + " and details are below\n");
								for (Player player : playerListByAge) {
									log.info(player);
								}
							}
						} catch (BusinessException e) {
							log.warn(e.getMessage());
						}
						break;
					case 9:
						log.info("\n\nGOING BACK TO MAIN MENU......\n\n");
						break;

					default:
						log.warn("Please enter valid choice (1-9)");
					}
				} while (option != 9);
				break;
			case 6:
				log.info("Thanks for using our app. Nice to meet you! ");
				break;
			default:
				log.warn("Please enter valid choice (1-6)\n");
			}
		} while (ch != 6);

	}

}
