using System;
using System.Collections.Generic;
using System.Text;

namespace Trab05
{
    public class UserData
    {
        private List<string[]> users = new List<string[]>();

        public UserData()
        {
            users.Add(new string[] { "usuario", "email@email.com", "1234"});
        }

        public void NewUser(string User, string Email, string Pass)
        {
            users.Add(new string[] { User, Email, Pass });
        }

        public bool Contains(string User, string Pass)
        {
            bool aux = false;
            for (int i = 0; i < users.Count; i++)
            {
                if((users[i][0] == User || users[i][1] == User) && users[i][2] == Pass)
                {
                    aux = true;
                }
            }
            return aux;
        }
    }
}
