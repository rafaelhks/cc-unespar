using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace Trab05
{
    public partial class MainPage : ContentPage
    {
        UserData data;

        public MainPage()
        {
            InitializeComponent();
        }

        public MainPage(UserData data)
        {
            InitializeComponent();
            this.data = data;
        }

        async private void bt_Login_Clicked(object sender, EventArgs e)
        {
            var user = username.Text;
            var pass = password.Text;

            if(pass==null || user == null)
            {
                await DisplayAlert("Erro!", "Informe um nome de usuário e senha para prosseguir.", "OK");
            }
            else
            {
                if (data.Contains(user, pass))
                {
                    await Navigation.PushAsync(new Lista_Page(data));
                }
                else
                {
                    await DisplayAlert("Erro!", "Usuário ou senha incorretos.", "Tentar Novamente");
                }
            }
        }

        private void bt_Cadastrar_Clicked(object sender, EventArgs e)
        {
            Navigation.PushAsync(new Cadastro(data));
        }
    }
}
