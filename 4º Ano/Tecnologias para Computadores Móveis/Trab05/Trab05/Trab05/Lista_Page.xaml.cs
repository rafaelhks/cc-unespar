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
	public partial class Lista_Page : ContentPage
	{
        List<Item> items = new List<Item>();
        UserData data;

		public Lista_Page()
		{
			InitializeComponent();
            initLista();
            produtos.ItemsSource = items;
        }

        public Lista_Page(UserData data)
        {
            InitializeComponent();
            initLista();
            this.data = data;
        }

        private void initLista()
        {
            items.Add(new Item("Teste", 20.0, "produto de teste 1"));
            items.Add(new Item("Teste2", 25.0, "produto de teste 2"));
            items.Add(new Item("Teste", 20.0, "produto de teste 1"));
            items.Add(new Item("Teste2", 25.0, "produto de teste 2"));
            items.Add(new Item("Teste", 20.0, "produto de teste 1"));
            items.Add(new Item("Teste2", 25.0, "produto de teste 2"));
            items.Add(new Item("Teste", 20.0, "produto de teste 1"));
            items.Add(new Item("Teste2", 25.0, "produto de teste 2"));
            items.Add(new Item("Teste", 20.0, "produto de teste 1"));
            items.Add(new Item("Teste", 20.0, "produto de teste 1"));
            items.Add(new Item("Teste2", 25.0, "produto de teste 2"));
            items.Add(new Item("Teste", 20.0, "produto de teste 1"));
            items.Add(new Item("Teste2", 25.0, "produto de teste 2"));
            items.Add(new Item("Teste", 20.0, "produto de teste 1"));
            items.Add(new Item("Teste2", 25.0, "produto de teste 2"));
            items.Add(new Item("Teste2", 25.0, "produto de teste 2"));
            items.Add(new Item("Teste", 20.0, "produto de teste 1"));
            items.Add(new Item("Teste2", 25.0, "produto de teste 2"));
            produtos.ItemsSource = items;
        }

        async private void MyListView_ItemTapped(object sender, ItemTappedEventArgs e)
        {
            Item item = (Item)produtos.SelectedItem;
            await DisplayAlert(item.Name, item.Description, "OK");
        }

        private void sair_Clicked(object sender, EventArgs e)
        {
            Navigation.PushAsync(new MainPage(data));
        }
    }
}