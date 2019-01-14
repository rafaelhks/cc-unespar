using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace Aula_XAML_Picker
{
    public partial class MainPage : ContentPage
    {
        ArrayList list = new ArrayList();

        public MainPage()
        {
            InitializeComponent();
            list.Add("Cat");
            list.Add("Zebra");
            list.Add("Dog");
            list.Add("Cow");

            Itens.ItemsSource = list;
        }

        async private void Itens_SelectedIndexChanged(object sender, EventArgs e)
        {
            var ItemSelecionado = Itens.SelectedItem.ToString();
            await DisplayAlert("Você selecionou: ", ItemSelecionado, "OK");
        }
    }
}
