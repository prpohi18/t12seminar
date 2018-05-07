 *ühenduse loomine
 
Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/...");

 *andmete kustutamine
PreparedStatement st = cn.prepareStatement("DELETE FROM ... WHERE ...");
st.executeUpdate();

 *andmete lisamine andmebaasi
PreparedStatement st = cn.prepareStatement("INSERT INTO ... " + "VALUES (..., '...', '...', '...', ...)");
st.executeUpdate();

 *andmete vaatamine andmebaasis
ArrayList<...> tabelinimi = new ArrayList<...>();
Statement st = cn.createStatement();
ResultSet rs = st.executeQuery("Select ..., ..., ... FROM tabelinimi");
