using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace Trab05
{
	[XamlCompilation(XamlCompilationOptions.Compile)]
	public partial class Cadastro : ContentPage
	{
        UserData data;

		public Cadastro ()
		{
			InitializeComponent ();
		}

        public Cadastro(UserData data)
        {
            InitializeComponent();
            this.data = data;
        }

        async private void bt_Cancelar_Clicked(object sender, EventArgs e)
        {
            bool b = await DisplayAlert("Cancelar", "Cancelar o cadastro de usuário?", "Sim", "Não");
            if(b) await Navigation.PopAsync();
        }

        async private void bt_Cadastrar_Clicked(object sender, EventArgs e)
        {
            string user = username.Text;
            string eml = email.Text;
            string pass = password.Text;
            string pass2 = password2.Text;

            if(user == null || pass == null || pass2==null)
            {
                await DisplayAlert("Erro!", "Preencha todos os campos para prosseguir!", "OK");
            }
            else
            {
                if (pass == pass2)
                {
                    data.NewUser(user, eml, pass);
                    await DisplayAlert("Cadastro", "Usuário cadastrado com sucesso!", "OK");
                    await Navigation.PopAsync();
                }
                else
                {
                    await DisplayAlert("Erro!", "A confirmação da senha está incorreta!", "OK");
                    password2.PlaceholderColor = Color.Red;
                    password2.Text = "";
                }

            }
        }
    }
}