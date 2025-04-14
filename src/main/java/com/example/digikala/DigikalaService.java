package com.example.digikala;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

public class DigikalaService {
    private static User curUser;
    private static ArrayList<User>users=new ArrayList<>();
    private static Admin curAdmin;
    private static ArrayList<Admin>admins=new ArrayList<>();
    private static Seller curSeller;
    private static ArrayList<Seller>sellers=new ArrayList<>();
    private static ArrayList<Product>products=new ArrayList<>();
    private ArrayList<ArrayList<Product>>Orders=new ArrayList<>();
    public static User getCurUser() {
        return curUser;
    }
    public static void setCurUser(User curUser) {
        DigikalaService.curUser = curUser;
    }
    public static Admin getCurAdmin() {
        return curAdmin;
    }
    public static void setCurAdmin(Admin curAdmin) {
        DigikalaService.curAdmin = curAdmin;
    }
    public static Seller getCurSeller() {
        return curSeller;
    }
    public static void setCurSeller(Seller curSeller) {
        DigikalaService.curSeller = curSeller;
    }
    public static ArrayList<User> getUsers() {
        return users;
    }
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    public static ArrayList<Admin> getAdmins() {
        return admins;
    }
    public static void setAdmins(ArrayList<Admin> admins) {
        DigikalaService.admins = admins;
    }
    public static ArrayList<Seller> getSellers() {
        return sellers;
    }
    public static void setSellers(ArrayList<Seller> sellers) {
        DigikalaService.sellers = sellers;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public static void addProduct(Product product) throws IOException {
        for(Product temp:products){
            if(temp.equals(product)){
                return;
            }
        }
        products.add(product);
    }
    public ArrayList<Product> searchByName(String name) {
        ArrayList<Product>temp = new ArrayList<>();
        for(Product cur : products){
            if(cur.getName().equals(name)){
                temp.add(cur);
            }
        }
        return temp;
    }
    public static void AddAdmin(String username, String password){
        Admin newadmin= new Admin();
        newadmin.setUsername(username);
        newadmin.setPassword(password);
        admins.add(newadmin);
    }
    public static void AddSeller(String username, String password){
        Seller newseller= new Seller();
        newseller.setUsername(username);
        newseller.setPassword(password);
        sellers.add(newseller);
    }
    public static void createAccount(String username, String password) {
        User newuser= new User();
        newuser.setUsername(username);
        newuser.setPassword(password);
        UUID uuid = UUID.randomUUID();
        newuser.setID(uuid.toString());
        users.add(newuser);
    }
    public static String loginUser(String username, String password) {
        for(User temp : users){
            if(temp.getUsername().equals(username) && temp.getPassword().equals(password)){
                curUser=temp;
                return "ok";
            }
            if(temp.getUsername().equals(username) && !temp.getPassword().equals(password)){
                //*print "Wrong password!";
                return "wrong password";
            }
        }
        //*print "No such user";
        return "no such user";
    }
    public static String loginAdmin(String username, String password) {
        for(Admin temp : admins){
            if(temp.getUsername().equals(username) && temp.getPassword().equals(password)){
                curAdmin=temp;
                return "ok";
            }
            if(temp.getUsername().equals(username) && !temp.getPassword().equals(password)){
                //*print "Wrong password!";
                return "wrong password";
            }
        }
        //*print "No such user";
        return "no such admin";
    }
    public static String loginSeller(String username, String password) {
        for(Seller temp : sellers){
            if(temp.getUsername().equals(username) && temp.getPassword().equals(password)){
                curSeller=temp;
                return "ok";
            }
            if(temp.getUsername().equals(username) && !temp.getPassword().equals(password)){
                //*print "Wrong password!";
                return "wrong password";
            }
        }
        //*print "No such user";
        return "no such seller";
    }
    public static User searchuser(String username){
        for(User temp:users){
            if(temp.getUsername().equals(username)){
                return temp;
            }
        }
        return null;
    }
    public void logout() {
        curUser=null;
        curSeller=null;
        curAdmin=null;
        //*print "You have successfully logged out!";
    }

    public static void ToString(Product product,int cnt){
        //*print Product and cnt
    }

    public static void initialize() throws SQLException {
        createAccount("Mahla","0000");
        AddAdmin("Mahla","0000");
    }
}
