package edu.thu.cslab.footwith.form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: wangjiayu
 * Date: 13-3-16
 * Time: 上午11:30
 * To change this template use File | Settings | File Templates.
 */
public class PlanManage extends  JFrame{
    // private  MainWindow frame = null;
    private JButton btnAdd = new JButton("添加");
    private  JButton btnDelete = new JButton("删除");
    private  JButton btnUpdate  = new JButton("更新");
    private  JButton btnQuery = new JButton("查找");
    // private  JButton btnReset = new JButton("重置");
    //  private  JButton btnHelp = new JButton("帮助");
    private  JTextField    siteId = new JTextField();
    private  JTextField  siteName = new JTextField();
    private  JTextField  siteLocation = new JTextField();
    private  JTextField  siteInfo = new JTextField();
    // picture
    public  PlanManage(){
        //  super(frame,title);
        init();
        this.setBounds(200,200,300,300);
        this.setVisible(true);
    }

    private void init() {

        ButtonLister myButtonLister = new ButtonLister();
        this.setTitle("计划信息管理界面" );
        // this.setLayout(new FlowLayout());
        //  JPanel topPane = new JPanel();
        this.setLayout(new GridLayout(6, 2));
        this.add(new JLabel("计划ID"));
        this.add(siteId);
        this.add(new JLabel("出发时间"));
        this.add(siteName);
        this.add(new JLabel("参观景点"));
        this.add(siteLocation);
        this.add(new JLabel("描述"));
        this.add(siteInfo);
        this.add(btnAdd);
        this.add(btnDelete);
        this.add(btnUpdate);
        this.add(btnQuery);

    }


}
class ButtonLister implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        try{
            if(cmd.equals("添加")){

            }  if(cmd.equals("删除")){

            } if(cmd.equals("更新")){

            } if(cmd.equals("查找")){

            }
        }catch (Exception e1){

        }
    }
}