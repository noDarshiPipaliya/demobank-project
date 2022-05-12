package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"","123456","an email address requires "},
                {"abcd@gmail.com","","password is required"},
                {"adfdfgfg","123456","invalid email address"},
                {"abcd@gmail.com","123456","authentication failed."},

        };
        return data;
    }

    @DataProvider(name = "product")
    public Object[][] dataset(){
        Object[][] data = new Object[][]{
                {"blouse","2","M","white"},
                {"printed dress","3","L","Orange"},
                {"Printed chiffon dress","4","S","Green"},
                {"Printed summer dress with Price $28.98","2","M","Blue"},

        };
        return data;
    }
}
