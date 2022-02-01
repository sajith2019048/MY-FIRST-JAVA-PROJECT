import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Formatter;
import java.util.Random;
import  java.util.*;

public class Formula1ChampionshipManager implements ChampionshipManager{
    ArrayList<ArrayList<String>> info = new ArrayList<>();



    public void drivers() {

        Scanner scan = new Scanner(System.in);
        System.out.print("How many drivers participate in this race -");
        int num_drive = scan.nextInt();
        if (num_drive <= 10 && num_drive > 1){

            for (int i = 0; i < num_drive; i++) {
                ArrayList<String> ss = new ArrayList<String>();
                ArrayList<Integer> pp = new ArrayList<Integer>();

                //Driver information get
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the driver name -");
                String name = input.nextLine();
                ss.add(name);

                System.out.print("Enter the driver location -");
                String location = input.next();
                ss.add(location);

                System.out.print("Enter the driver team -");
                String team = input.next();
                ss.add(team);

                if (!info.isEmpty()){
                    boolean found = false;
                    for (int m = 0; m < info.size(); m++) {

                        if (info.get(m).get(0).equals(name) && info.get(m).get(1).equals(location) && info.get(m).get(2).equals(team)) {
                            int rk = Integer.valueOf(info.get(m).get(7)) + 1;

                            //Calculation of positions and points;
                            Random rn = new Random();

                            int w =0;
                            int position = rn.nextInt(num_drive - w) + 1;
                            w = w + 2;


                            if (position == 1) {
                                int tt = Integer.valueOf(info.get(m).get(3)) + 1;
                                ss.add(String.valueOf(tt));
                                ss.add(String.valueOf(info.get(m).get(4)));
                                ss.add(String.valueOf(info.get(m).get(5)));
                                ss.add(String.valueOf(Integer.valueOf(info.get(m).get(6))+25));
                            } else if (position == 2) {
                                ss.add(String.valueOf(info.get(m).get(3)));
                                int tt = Integer.valueOf(info.get(m).get(4)) + 1;
                                ss.add(String.valueOf(tt));
                                ss.add(String.valueOf(info.get(m).get(5)));
                                ss.add(String.valueOf(Integer.valueOf(info.get(m).get(6))+18));
                            } else if (position == 3) {
                                ss.add(String.valueOf(info.get(m).get(3)));
                                ss.add(String.valueOf(info.get(m).get(4)));
                                int tt = Integer.valueOf(info.get(m).get(5)) + 1;
                                ss.add(String.valueOf(tt));
                                ss.add(String.valueOf(Integer.valueOf(info.get(m).get(6))+15));
                            } else if (position == 4) {
                                ss.add(String.valueOf(info.get(m).get(3)));
                                ss.add(String.valueOf(info.get(m).get(4)));
                                ss.add(String.valueOf(info.get(m).get(5)));
                                ss.add(String.valueOf(Integer.valueOf(info.get(m).get(6))+12));
                            } else if (position == 5) {
                                ss.add(String.valueOf(info.get(m).get(3)));
                                ss.add(String.valueOf(info.get(m).get(4)));
                                ss.add(String.valueOf(info.get(m).get(5)));
                                ss.add(String.valueOf(Integer.valueOf(info.get(m).get(6))+10));
                            } else if (position == 6) {
                                ss.add(String.valueOf(info.get(m).get(3)));
                                ss.add(String.valueOf(info.get(m).get(4)));
                                ss.add(String.valueOf(info.get(m).get(5)));
                                ss.add(String.valueOf(Integer.valueOf(info.get(m).get(6))+8));
                            } else if (position == 7) {
                                ss.add(String.valueOf(info.get(m).get(3)));
                                ss.add(String.valueOf(info.get(m).get(4)));
                                ss.add(String.valueOf(info.get(m).get(5)));
                                ss.add(String.valueOf(Integer.valueOf(info.get(m).get(6))+6));
                            } else if (position == 8) {
                                ss.add(String.valueOf(info.get(m).get(3)));
                                ss.add(String.valueOf(info.get(m).get(4)));
                                ss.add(String.valueOf(info.get(m).get(5)));
                                ss.add(String.valueOf(Integer.valueOf(info.get(m).get(6))+4));
                            } else if (position == 9) {
                                ss.add(String.valueOf(info.get(m).get(3)));
                                ss.add(String.valueOf(info.get(m).get(4)));
                                ss.add(String.valueOf(info.get(m).get(5)));
                                ss.add(String.valueOf(Integer.valueOf(info.get(m).get(6))+2));
                            } else if (position == 10) {
                                ss.add(String.valueOf(info.get(m).get(3)));
                                ss.add(String.valueOf(info.get(m).get(4)));
                                ss.add(String.valueOf(info.get(m).get(5)));
                                ss.add(String.valueOf(Integer.valueOf(info.get(m).get(6))+1));
                            }
                            ss.add(String.valueOf(rk));
                            pp.add(position);
                            ss.add(String.valueOf(pp));

                            DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                            Calendar calobj = Calendar.getInstance();
                            ss.add(df.format(calobj.getTime()));

                            info.set(m, ss);
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        continue;
                    }
                }



                // Calculation races.
                int num_races  = 0;
                num_races = num_races + 1;


                //Calculation of positions and points;
                Random rn = new Random();

                int w =0;
                int position = rn.nextInt(num_drive - w) + 1;
                w = w + 2;

                if (position == 1) {
                        ss.add(String.valueOf(1));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(25));
                } else if (position == 2) {
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(1));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(18));
                    } else if (position == 3) {
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(1));
                        ss.add(String.valueOf(15));
                    } else if (position == 4) {
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(12));
                    } else if (position == 5) {
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(10));
                    } else if (position == 6) {
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(8));
                    } else if (position == 7) {
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(6));
                    } else if (position == 8) {
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(4));
                    } else if (position == 9) {
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(2));
                    } else if (position == 10) {
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(0));
                        ss.add(String.valueOf(1));
                    }
                    ss.add(String.valueOf(num_races));
                    pp.add(position);
                    ss.add(String.valueOf(pp));

                    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
                    Calendar calobj = Calendar.getInstance();
                    ss.add(df.format(calobj.getTime()));

                    info.add(ss);
                Collections.sort(info, new Comparator<ArrayList<String>>() {
                    @Override
                    public int compare(ArrayList<String> p1, ArrayList<String> p2) {
                        return Integer.valueOf(p2.get(6)) - Integer.valueOf(p1.get(6));
                    }
                });
            }



        }else{System.out.println("Minimum 2 drivers Maximum 10 drivers can only participated in this race");drivers();}
    }
    public void delete() {

        Scanner ff = new Scanner(System.in);
        System.out.print("Enter the driver name want to delete -");
        String find_name = ff.nextLine();
        for (int i = 0; i < info.size(); i++) {

            if (info.get(i).get(0).equals(find_name)) {
                info.remove(i);
            }
        }System.out.println("Successfully delete the driver.");
    }
    public void Change_team(){

        Scanner uu = new Scanner(System.in);
        System.out.print("Enter the driver name want to Change the team -");
        String find_name = uu.nextLine();
        for (int i = 0; i < info.size(); i++) {

            if (info.get(i).get(0).equals(find_name)) {
                Scanner vv = new Scanner(System.in);
                System.out.print("Enter the driver team name want to change -");
                String find_team_name = vv.nextLine();
                info.get(i).set(2, find_team_name);
            }
        }System.out.println("Successfully Change the team.");
    }

    public String d_statistics(){
        Scanner uu = new Scanner(System.in);
        System.out.print("Enter the driver name want to Find various statistics -");
        String find_name = uu.nextLine();

        Formatter fmt3 = new Formatter();
        fmt3.format("%14s %23s %19s \n", "Name", "Number of points", "Number of races");
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).get(0).equals(find_name)) {
                fmt3.format(" %11s %18s %19s \n",info.get(i).get(0),info.get(i).get(6),info.get(i).get(7));
            }
        }System.out.println(fmt3);
        return String.valueOf(fmt3);
    }


    public String d_details() {

        Formatter fmt1 = new Formatter();
        fmt1.format("%14s %14s %14s \n", "Name", "Location", "Team");
        for(int i = 0;i < info.size();i++){
            fmt1.format(" %11s %13s %16s \n",info.get(i).get(0),info.get(i).get(1),info.get(i).get(2));
        }System.out.println(fmt1);
        return String.valueOf(fmt1);
    }

    public String formula_d(){
        Formatter fmt2 = new Formatter();
        fmt2.format("%1s %14s %14s %19s %19s %19s %19s %19s  \n", "Name", "Location", "Team", "first_position" , "second_position" , "third_position" , "Number of points" , "Number of races");
        for(int i = 0;i < info.size();i++){
            fmt2.format(" %2s %11s %16s %14s %18s %18s  %19s %20s  \n",info.get(i).get(0),info.get(i).get(1),info.get(i).get(2),info.get(i).get(3),info.get(i).get(4),info.get(i).get(5),info.get(i).get(6),info.get(i).get(7));
        }//System.out.println(fmt2);
        return (String.valueOf (fmt2));

    }

    public String race_completed(){
        Formatter fmt4 = new Formatter();
        fmt4.format("%1s %14s %14s %19s %19s %19s %19s %19s %15s %19s\n", "Name", "Location", "Team", "first_position" , "second_position" , "third_position" , "Number of points" , "Number of races" , "Position","Date and Time");
        for(int i = 0;i < info.size();i++){
            fmt4.format(" %2s %11s %16s %14s %18s %18s  %19s %20s %20s %22s\n",info.get(i).get(0),info.get(i).get(1),info.get(i).get(2),info.get(i).get(3),info.get(i).get(4),info.get(i).get(5),info.get(i).get(6),info.get(i).get(7),info.get(i).get(8),info.get(i).get(9));
        }
        return (String.valueOf(fmt4));
    }

    public void saving_file(){
        try {
            FileWriter myWriter = new FileWriter("information_entered.txt");
            myWriter.write(race_completed());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void next_time(){
        try {
            File myObj = new File("information_entered.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void saving_formula(){
        try {
            FileWriter myWriter = new FileWriter("formula.txt");
            myWriter.write(formula_d());
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
