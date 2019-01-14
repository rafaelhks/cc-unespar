using System;
using System.Collections.Generic;
using System.Text;

namespace Trab05
{
    public class Item
    {
        private string name, description;
        private double value;
        public string Name { get { return this.name; } }
        public string Description { get { return "R$ "+this.value+"     "+this.description; } }

        public Item(string name, double value, string description)
        {
            this.name = name;
            this.description = description;
            this.value = value;
        }
    }
}
