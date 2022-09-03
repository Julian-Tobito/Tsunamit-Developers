package udea.sprint3.demo.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListEnterpriseTest {

    private ListEnterprise listEnterprise;

    @Test
    void findEnterprise() {
        listEnterprise= new ListEnterprise();
        assertNull(listEnterprise.findEnterprise(123));
        listEnterprise.addEnterprise(new Enterprise("Coca Cola", "cra 45 #13-12","3106492044",1234));
        assertNotNull(listEnterprise.findEnterprise(1234));
    }

    @Test
    void addEnterprise() {
        listEnterprise= new ListEnterprise();
        assertTrue(listEnterprise.addEnterprise(new Enterprise("Coca Cola", "cra 45 #13-12","3106492044",1234)));
        assertFalse(listEnterprise.addEnterprise(new Enterprise("Coca Cola", "cra 45 #13-12","3106492044",1234)));
    }

    @Test
    void updateEnterprise() {
        listEnterprise= new ListEnterprise();
        listEnterprise.addEnterprise(new Enterprise("Coca Cola", "cra 45 #13-12","3106492044",1234));
        assertNotNull(listEnterprise.updateEnterprise(new Enterprise("EMB", "cra 36 #12-34","3154152027",1234)));
        assertNull(listEnterprise.updateEnterprise(new Enterprise("EMB", "cra 36 #12-34","3154152027",1111)));
    }

    @Test
    void deleteEnterprise() {
        listEnterprise= new ListEnterprise();
        listEnterprise.addEnterprise(new Enterprise("Coca Cola", "cra 45 #13-12","3106492044",1234));
        assertNull(listEnterprise.deleteEnterprise(listEnterprise.findEnterprise(4444)));
        assertNotNull(listEnterprise.deleteEnterprise(listEnterprise.findEnterprise(1234)));
    }

    @Test
    void getListEnterprise() {
        listEnterprise= new ListEnterprise();
        listEnterprise.addEnterprise(new Enterprise("Coca Cola", "cra 45 #13-12","3106492044",1234));
        listEnterprise.addEnterprise(new Enterprise("AMB","cra 34 #67-89","3154152027",5678));
        assertEquals("Coca Cola",listEnterprise.getListEnterprise().get(0).getName());
    }
}