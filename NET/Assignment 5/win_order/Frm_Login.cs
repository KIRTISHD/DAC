using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace win_order
{
    public partial class Frm_Login : Form
    {
        public Frm_Login()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            loginIDStatus.Text = "";
            passwordStatus.Text = "";
        }

        private bool checkForm(string username, string password)
        {
            bool isAnyThingWrong = false;
            if (username == String.Empty)
            {
                loginIDStatus.Text = "Enter LoginID";
                isAnyThingWrong = true;
            }
            if (password == String.Empty)
            {
                passwordStatus.Text = "Enter Password";
                isAnyThingWrong = true;
            }
            if (isAnyThingWrong)
                return false;
            else
                return true;
        }

        private void Login_Click(object sender, EventArgs e)
        {

            loginIDStatus.Text = "";
            passwordStatus.Text = "";

            String username = txtLoginID.Text;
            string password = txtPassword.Text;

            bool res = checkForm(username,password);
            if (res)
            {
                bool check = StoreClass.checkCred(username, password);
                if (check)
                {
                    Frm_Home hm = new Frm_Home();
                    hm.Show();
                    this.Close();
                }
            }
        }

        private void RegisterButton_Click(object sender, EventArgs e)
        {
            Frm_NewCustomer new_cust = new Frm_NewCustomer();
            new_cust.Show();
        }
    }
}
