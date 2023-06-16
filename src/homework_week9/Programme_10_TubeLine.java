package homework_week9;

import java.util.Scanner;

/**
 * Created By Jay Vaghani
 */
/*
Write the programme that tell you which line padd through Particular stations. Just use Zone 1 Stations Name
 */

public class Programme_10_TubeLine {
    public static void main(String[] args) {
        // list of all station in zone 1 of london
        String[] tubeStationZone1 = new String[]{ "Aldgate", "Aldgate East", "Angle", "Baker Street", "Bank", "Barbican",
                "Bayswater", "Blackfriars", "Bond Street", "Borough", "cannon Street", "Chancery Lane", "Charing Cross",
                "Covent Garden", "Earl's Court", "Edgware Road", "Elephant & Castle", "Embankment", "Euston", "Euston Square",
                "Farringdon", "Gloucester Road", "Goodge Street", "Great Portland Street", "Green Park", "High Street Kensington",
                "Holborn", "Hyde Park corner", "King's cross", "Knightsbridge", "lambeth North", "Lancaster gate", "Leicester Square",
                "Liverpool Street", "London Bridge", "Mansion House", "Marble Arch", "Marylebone", "Monument", "Moorgate",
                "Notting Hill Gate", "Old Street", "Oxford Circus", "Paddington", "Piccadilly Circus", "Pimlico", "Queensway",
                "Regent's Park", "Russell Square", "Sloane Square", "South Kensington", "St Pancras", "St. Paul's", "Temple",
                "Tottenham Court Road", "Tower Gateway", "Tower Hill", "Vauxhall", "Victoria", "Warren Street", "Waterloo East",
                "Waterloo", "Westminster" };

            // System.out.println(tubeStationZone1.length); // for debug purpose

            int length = tubeStationZone1.length;

            String[][] londonUGLines = new String[12][length];
            londonUGLines[0][0] = "bakerloo Line"; // line name
            londonUGLines[0][1] = "Baker Street"; // station name
            londonUGLines[0][2] = "Charing Cross"; // station name
            londonUGLines[0][3] = "Edgware Road"; // station name
            londonUGLines[0][4] = "Elephant & Castle"; // station name
            londonUGLines[0][5] = "Embankment"; // station name
            londonUGLines[0][6] = "Lambeth North"; // station name
            londonUGLines[0][7] = "Marylebone"; // station name
            londonUGLines[0][8] = "Oxford Circus"; // station name
            londonUGLines[0][9] = "Regent's Park"; // station name
            londonUGLines[0][10] = "Waterloo"; // station name

            londonUGLines[1][0] = "Central Line"; // Line name
            londonUGLines[1][1]= "Aldgate"; // station name
            londonUGLines[1][2]= "Baker Street"; // station name
            londonUGLines[1][3]= "Barbican"; // station name
            londonUGLines[1][4]= "Bayswater"; // station name
            londonUGLines[1][5]= "Bank"; // station name
            londonUGLines[1][6]= "Bond Street"; // station name
            londonUGLines[1][7]= "Chancery Lane"; // station name
            londonUGLines[1][8]= "Holborn"; // station name
            londonUGLines[1][9]= "Lancaster Gate"; // station name
            londonUGLines[1][10]= "Liverpool Street"; // station name
            londonUGLines[1][11]= "Marble Arch"; // station name
            londonUGLines[1][12]= "Notting Hill gate"; // station name
            londonUGLines[1][13]= "Oxford Circus"; // station name
            londonUGLines[1][14]= "Queensway"; // station name
            londonUGLines[1][15]= "St. Paul's"; // station name
            londonUGLines[1][16]= "Tottenham Court Road"; // station name

        londonUGLines[2][0] = "Circle Line"; // Line name
        londonUGLines[2][1] = "Edgware Road"; // station name
        londonUGLines[2][2] = "Baker Street"; // station name
        londonUGLines[2][3] = "Farringdon"; // station name
        londonUGLines[2][4] = "Barbican";// station name
        londonUGLines[2][5] = "Aldgata";// station name
        londonUGLines[2][6] = "Blackfriars";// station name
        londonUGLines[2][7] = "Bayswater";// station name
        londonUGLines[2][8] = "Cannon Street";// station name
        londonUGLines[2][9] = "Embankment";// station name
        londonUGLines[2][10] = "Euston Square";// station name
        londonUGLines[2][11] = "Gloucester Road";// station name
        londonUGLines[2][12] = "Great Portland Street";// station name
        londonUGLines[2][13] = "High Street Kensington";// station name
        londonUGLines[2][14] = "King's Cross";// station name
        londonUGLines[2][15] = "Liverpool Street";// station name
        londonUGLines[2][16] = "Mansion House";// station name
        londonUGLines[2][17] = "Monument";// station name
        londonUGLines[2][18] = "Notting Hill Gate";// station name
        londonUGLines[2][19] = "Sloane Square";// station name
        londonUGLines[2][20] = "South Kensington";// station name
        londonUGLines[2][21] = "St Pancras";// station name
        londonUGLines[2][22] = "Temple";// station name
        londonUGLines[2][23] = "Tower Hill";// station name
        londonUGLines[2][24] = "Victoria";// station name
        londonUGLines[2][25] = "Westminster";// station name

        londonUGLines[3][0] = "District Line";
        londonUGLines[3][1] = "Edgware Road";// station name
        londonUGLines[3][2] = "Paddington";// station name
        londonUGLines[3][3] = "Bayswater";// station name
        londonUGLines[3][4] = "Aldgate East";// station name
        londonUGLines[3][5] = "Blackfriars";// station name
        londonUGLines[3][6] = "Cannon Street";// station name
        londonUGLines[3][7] = "Earl's Court";// station name
        londonUGLines[3][8] = "Embankment";// station name
        londonUGLines[3][9] = "Gloucester Road";// station name
        londonUGLines[3][10] = "High Street Kensington";// station name
        londonUGLines[3][11] = "Mansion House";// station name
        londonUGLines[3][12] = "Monument";// station name
        londonUGLines[3][13] = "Notting Hill Gate";// station name
        londonUGLines[3][14] = "Sloane Square";// station name
        londonUGLines[3][15] = "South Kensington";// station name
        londonUGLines[3][16] = "Temple";// station name
        londonUGLines[3][17] = "Tower Hill";// station name
        londonUGLines[3][18] = "Victoria";// station name
        londonUGLines[3][19] = "Westminster";// station name

        londonUGLines[4][0] = "Hammersmith Line";// line name
        londonUGLines[4][1] = "Aldgate East";// station name
        londonUGLines[4][2] = "Liverpool Street";// station name
        londonUGLines[4][3] = "King's Cross";// station name
        londonUGLines[4][4] = "Barbican";// station name
        londonUGLines[4][5] = "Edgware Road";// station name
        londonUGLines[4][6] = "Euston Square";// station name
        londonUGLines[4][7] = "Farringdon";// station name
        londonUGLines[4][8] = "Great Portland Street";// station name
        londonUGLines[4][9] = "St Pancras";// station name

        londonUGLines[5][0] = "Jubilee Line"; // line name
        londonUGLines[5][1] = "Baker Street";// station name
        londonUGLines[5][2] = "Bond Street";// station name
        londonUGLines[5][3] = "Westminster";// station name
        londonUGLines[5][4] = "Waterloo";// station name
        londonUGLines[5][5] = "Green Park";// station name
        londonUGLines[5][6] = "London Bridge";// station name

        londonUGLines[6][0] = "Metropolitan Line"; // line name
        londonUGLines[6][1] = "Aldgate";// station name
        londonUGLines[6][2] = "Liverpool Street";// station name
        londonUGLines[6][3] = "Moorgate";// station name
        londonUGLines[6][4] = "Barbican";// station name
        londonUGLines[6][5] = "Baker Street";// station name
        londonUGLines[6][6] = "Euston Square";// station name
        londonUGLines[6][7] = "Farringdon";// station name
        londonUGLines[6][8] = "Great Portland Street";// station name
        londonUGLines[6][9] = "King's Cross";// station name
        londonUGLines[6][10] = "St Pancras";// station name

        londonUGLines[7][0] = "Northern Line"; // line name
        londonUGLines[7][1] = "Borough";// station name
        londonUGLines[7][2] = "London Bridge";// station name
        londonUGLines[7][3] = "Moorgate";// station name
        londonUGLines[7][4] = "Old Street";// station name
        londonUGLines[7][5] = "Angel";// station name
        londonUGLines[7][6] = "Bank";// station name
        londonUGLines[7][7] = "Elephant & Castle";// station name
        londonUGLines[7][8] = "Embankment";// station name
        londonUGLines[7][9] = "Euston";// station name
        londonUGLines[7][10] = "Goodge Street";// station name
        londonUGLines[7][11] = "King's Cross";// station name
        londonUGLines[7][12] = "Leicester Square";// station name
        londonUGLines[7][13] = "St Pancras";// station name
        londonUGLines[7][14] = "Warren Street";// station name
        londonUGLines[7][15] = "Waterloo";// station name

        londonUGLines[8][0] = "Piccadilly Line";// line name
        londonUGLines[8][1] = "Green Park";// station name
        londonUGLines[8][2] = "Picaadilly Circus";// station name
        londonUGLines[8][3] = "Leicester Square";// station name
        londonUGLines[8][4] = "Covent Garden";// station name
        londonUGLines[8][5] = "Earl's Court";// station name
        londonUGLines[8][6] = "Gloucester Road";// station name
        londonUGLines[8][7] = "Hyde Park Corner";// station name
        londonUGLines[8][8] = "King's Cross";// station name
        londonUGLines[8][9] = "Knightsbridge";// station name
        londonUGLines[8][10] = "Russell Square";// station name
        londonUGLines[8][11] = "South Kensington";// station name
        londonUGLines[8][12] = "St Pancras";// station name

        londonUGLines[9][0] = "Victoria Line";// line name
        londonUGLines[9][1] = "Euston";// station name
        londonUGLines[9][2] = "Warren Street";// station name
        londonUGLines[9][3] = "Oxford Circus";// station name
        londonUGLines[9][4] = "Green Park";// station name
        londonUGLines[9][5] = "King's Cross";// station name
        londonUGLines[9][6] = "Pimlico";// station name
        londonUGLines[9][7] = "St Pancras";// station name
        londonUGLines[9][8] = "Vauxhall";// station name
        londonUGLines[9][9] = "Victoria";// station name

        londonUGLines[10][0] = "Waterloo & City Line"; // line name
        londonUGLines[10][1] = "Bank";// station name
        londonUGLines[10][2] = "Waterloo";// station name
        londonUGLines[10][3] = "Barbican";// station name
        londonUGLines[10][4] = "Bayswater";// station name

        londonUGLines[11][0] = "DLR Line"; // line name
        londonUGLines[11][1] = "Bank";// station name
        londonUGLines[11][2] = "Tower Gateway";// station name

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the tube station's name of Zone 1 :");

        // input wizard for the user , and store his/her Input as a variable
        String userTubeStation = scan.nextLine();
        String catchStationName = "";

        // checking, if user input is present in the list of zone 1 stations

        for (int i =0; i<tubeStationZone1.length; i++){
            if (userTubeStation.equalsIgnoreCase(tubeStationZone1[i])){
                catchStationName = tubeStationZone1[i];
            }

        }
        // logic to find the line names from the given input from the user

        if (userTubeStation.equalsIgnoreCase(catchStationName)){
            System.out.println(userTubeStation + "Station is in the zone 1.");

            System.out.println("--------------------------------------------------------------------------------------");

            System.out.println("Following line(s) passing through the given tube station :" + userTubeStation);

            System.out.println("--------------------------------------------------------------------------------------");

            for (int x=0; x<londonUGLines.length; x++){
                for (int y =1; y<tubeStationZone1.length; y++){
                    String match = londonUGLines[x][y];

                    if (userTubeStation.equalsIgnoreCase(match)){
                        System.out.println(londonUGLines[x][0]);
                    }
                }
            }
        }else {
            System.out.println("Station is not in the zone 1.");
        }
    }

}

