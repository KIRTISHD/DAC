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
    public partial class Frm_NewCustomer : Form
    {
        public Frm_NewCustomer()
        {
            InitializeComponent();
            
        }

        public bool checkForm(string custName, string custEmail, string custCity, string custGender, string custPassword)
        {
            bool isAnyThingWrong = false;
            if (custName == String.Empty)
            {
                custNameStatus.Text = "Enter Customer";
                isAnyThingWrong = true;
            }
            if (custEmail == String.Empty)
            {
                custEmailStatus.Text = "Enter Email";
                isAnyThingWrong = true;
            }
            if (custCity == String.Empty)
            {
                custCityStatus.Text = "Select City";
                isAnyThingWrong = true;
            }
            if (custGender == String.Empty)
            {
                custGenderStatus.Text = "Select Gender";
                isAnyThingWrong = true;
            }
            if (custPassword == String.Empty)
            {
                custPasswordStatus.Text = "Enter Password";
                isAnyThingWrong = true;
            }
            if (isAnyThingWrong)
                return false;
            else
                return true;
        }

        private void BtnRegister_Click(object sender, EventArgs e)
        {

            custNameStatus.Text = "";
            custEmailStatus.Text = "";
            custCityStatus.Text = "";
            custGenderStatus.Text = "";
            custPasswordStatus.Text = "";

            string custName = txtCustomerName.Text;
            string custEmail = txtCustomerEmail.Text;
            string custCity = txtCity.Text;
            string custGender = "";
            if (radioMale.Checked) { custGender = "male"; }
            else { custGender = "female"; }
            string custPassword = txtPassword.Text;

            bool res = checkForm(custName, custEmail, custCity, custGender, custPassword);
            if (res)
            {
                StoreClass.addCustomer(custName, custEmail, custCity, custGender, custPassword);
                MessageBox.Show("Customer Added Successfully");
                this.Close();
            }
        }

        private void Frm_NewCustomer_Load(object sender, EventArgs e)
        {
            custNameStatus.Text = "";
            custEmailStatus.Text = "";
            custCityStatus.Text = "";
            custGenderStatus.Text = "";
            custPasswordStatus.Text = "";
        }
    }
}
