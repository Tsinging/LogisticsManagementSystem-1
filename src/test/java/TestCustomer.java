import lms.mapper.*;
import lms.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TestCustomer {
    @Autowired
    LmsAdminMapper lmsAdminMapper;

    @Autowired
    LmsCommodityReceiptMapper commodityReceiptMapper;

    @Test
    public void fun(){

        List<LmsAdmin> adminList=lmsAdminMapper.selectByExample(null);
        System.out.println(adminList);

    }

    @Test
    public void findLmsCommodityReceipt(){

        List<LmsCommodityReceipt> adminList=commodityReceiptMapper.findAllResultMap();
        BigDecimal big = new BigDecimal(1);
//        LmcCommodityReceipt adminList=commodityReceiptMapper.selectByPrimaryKey(big);
        System.out.println(adminList);
        for (LmsCommodityReceipt list:
             adminList) {
            System.out.println(list.toString());
        }
    }


    @Autowired
    LmsCenterproductExportMapper centerproductExportMapper;
    @Test
    public void findLmsCenterproductExportMapper(){

        List<LmsCenterproductExport>  list=centerproductExportMapper.findSupplierResultMap();
//        BigDecimal big = new BigDecimal(1);
//        LmcCommodityReceipt adminList=commodityReceiptMapper.selectByPrimaryKey(big);
        System.out.println(list);
        for (LmsCenterproductExport list1:
                list) {
            System.out.println(list1.toString());
            System.out.println(list1.getLmsSuppliers().get(0).toString());
        }
    }

    @Autowired
    LmsCenterproductExportItemMapper centerproductExportItemMapper;
    @Test
    public void findLmsCenterproductExportItemMapper(){
        List<LmsCenterproductExportItem>  list=centerproductExportItemMapper.findProductExportResultMap();
        System.out.println(list);
        for (LmsCenterproductExportItem list1:
                list) {
            System.out.println(list1.toString());
            System.out.println(list1.getProductExportList().get(0).toString());
        }

        System.out.println("---------------------");
        List<LmsCenterproductExportItem>  list2=centerproductExportItemMapper.findProductResultMap();
        System.out.println(list);
        for (LmsCenterproductExportItem list1:
                list) {
            System.out.println(list1.toString());
            System.out.println(list1.getProductList().get(0).toString());
        }
    }

    @Autowired
    LmsCommodityReceiptItemMapper commodityReceiptItemMapper;
    @Test
    public void findLmsCommodityReceiptItemMapper(){
        List<LmsCommodityReceiptItem>  list=commodityReceiptItemMapper.findCommodityReceiptMap();
        System.out.println(list);
        for (LmsCommodityReceiptItem list1:
                list) {
            System.out.println(list1.toString());
            System.out.println(list1.getCommodityReceiptList().get(0).toString());
        }

        System.out.println("---------------------");
        List<LmsCommodityReceiptItem>  list2=commodityReceiptItemMapper.findProductResultMap();
        System.out.println(list);
        for (LmsCommodityReceiptItem list1:
                list) {
            System.out.println(list1.toString());
            System.out.println(list1.getProductList().get(0).toString());
        }
    }


    @Autowired
    LmsDeliveryStaffMapper deliveryStaffMapper;
    @Test
    public void findLmsDeliveryStaffMapper(){

        List<LmsDeliveryStaff>  list=deliveryStaffMapper.findStationResultMap();
//        BigDecimal big = new BigDecimal(1);
//        LmcCommodityReceipt adminList=commodityReceiptMapper.selectByPrimaryKey(big);
        System.out.println(list);
        for (LmsDeliveryStaff list1:
                list) {
            System.out.println(list1.toString());
            System.out.println(list1.getStationList().get(0).toString());
        }
    }


    @Autowired
    LmsOrderMapper orderMapper;
    @Test
    public void findLmsOrderMapper(){

        List<LmsOrder>  list=orderMapper.findCustomerAndAdminMap();
//        BigDecimal big = new BigDecimal(1);
//        LmcCommodityReceipt adminList=commodityReceiptMapper.selectByPrimaryKey(big);
        System.out.println(list);
        for (LmsOrder list1:
             list) {
            System.out.println(list1.toString());
        }

    }
}
