package namudarbai;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Zmogelis {

    protected String vardas;
    protected String pavarde;

    public Zmogelis(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    @Override
    public String toString() {
        return vardas + " " + pavarde;
    }
    
    public static void main(String[] args) {

        Zmogelis z1 = new Zmogelis("Jonas", "Jonaitis");
        Zmogelis z2 = new Zmogelis("Petras", "Petraitis");
        Zmogelis z3 = new Zmogelis("Antanas", "Antanaitis");
        Zmogelis z4 = new Zmogelis("Jonas", "Petraitis");
        Zmogelis z5 = new Zmogelis("Jonas", "Antanaitis");
        Zmogelis z6 = new Zmogelis("Antanas", "Petraitis");
        Zmogelis z7 = new Zmogelis("Petras", "Jonaitis");

        List<Zmogelis> list = new ArrayList();
        list.add(z1);
        list.add(z2);
        list.add(z3);
        list.add(z4);
        list.add(z5);
        list.add(z6);
        list.add(z7);

        System.out.println("Pradinis listas: ");
        System.out.println(list);
        System.out.println("");

// 1. RUSIAVIMAS: PAGAL VARDA
        
        class pagalVarda<T extends Zmogelis> implements Comparator<T> {

            @Override
            public int compare(T o1, T o2) {
                String s1 = o1.vardas;
                String s2 = o2.vardas;
                return s1.compareTo(s2);
            }
        }

        Comparator v = new pagalVarda();
        list.sort(v);

        System.out.println("Isrusiuota pagal varda (didejimo tvarka)");
        System.out.println(list);
        System.out.println("");

// 2. RUSIAVIMAS: PAGAL PAVARDE
        
        Comparator<Zmogelis> pp = new Comparator<Zmogelis>() {
                
            @Override
            public int compare(Zmogelis o1, Zmogelis o2) {
                String s1 = o1.pavarde;
                String s2 = o2.pavarde;
                return s1.compareTo(s2);
            }
        };
    
        list.sort(pp.reversed());

        System.out.println("Isrusiuota pagal pavarde (mazejimo tvarka)");
        System.out.println(list);
        System.out.println("");
            
// 3. RUSIAVIMAS: PAGAL VARDA PAVARDE
        
        class pagalVardaPavarde<T> implements Comparator<T> {

            @Override
            public int compare(T o1, T o2) {
                String s1 =  o1.toString();
                String s2 =  o2.toString();
                return s1.compareTo(s2);
            }
        }

        Comparator pvp = new pagalVardaPavarde();
        list.sort(pvp);

        System.out.println("Isrusiuota pagal varda ir pavarde (didejimo tvarka)");
        System.out.println(list);
        System.out.println("");
        
// 4. RUSIAVIMAS: PAGAL PAVARDE VARDA
    
        Comparator<Zmogelis> pv = new Comparator<Zmogelis>() {
                
            @Override
            public int compare(Zmogelis o1, Zmogelis o2) {
                String s1 = o1.pavarde + o1.vardas;
                String s2 = o2.pavarde + o2.vardas;
                return s1.compareTo(s2);
            }
        };
        
        list.sort(pv.reversed());

        System.out.println("Isrusiuota pagal pavarde ir varda (mazejimo tvarka)");
        System.out.println(list);
        System.out.println("");

// 5. RUSIAVIMAS: PAGAL VARDO IR PAVARDES ILGI DIDEJIMO TVARKA
    
        Comparator<Zmogelis> vpi = new Comparator<Zmogelis>() {
                
            @Override
            public int compare(Zmogelis o1, Zmogelis o2) {
                int s1 = o1.vardas.length() + o1.pavarde.length();
                int s2 = o2.vardas.length() + o2.pavarde.length();
                return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
            }
        };
    
        list.sort(vpi);

        System.out.println("Isrusiuota pagal vardo ir pavardes ilgi (didejimo tvarka)");
        System.out.println(list);
        
        }
    }

// jonas  - 5, petras - 6; Antanas - 7;
//jonaitis - 8; petraitis - 9; antanaitis - 10
// 13 14 14 15 15 16 17

    /*

sukurti klase Zmogus (vardas, pavarde)
 
i List'a (kuris turi generic'a Zmogus) sudeti:
 
Jonas Jonaitis
Petras Petraitis
Antanas Antanaitis
Jonas Petraitis
Jonas Antanaitis
Antanas Petraitis
Petras Jonaitis
 
sukurti Comparator klase (su generic), kuri rusiuotu zmones
 
1. tik pagal varda (didejimo tvarka)
2. tik pagal pavarde (mazejimo tvarka) *
3. pagal varda pavarde (didejimo tvarka)
4. pagal pavarde varda (mazejimo tvarka) *
5. pagal vardo ir pavardes (kartu) ilgi (didejimo tvarka) *
 

2, 4 ir 5 padaryti su anoniminem klasem *
 
surusiuoti List'a su kiekvienu is Comparator'iu
ir atspausdinti po kiekvieno rusiavimo

    //didejimo tvarka - abcdef..., mazejimo tvarka - fedcba..
 

        // Destytojo nd pavizdys: *******************************


        List<Zmogus> l = new ArrayList();
        
        l.add(new Zmogus("Jonas", "Jonaitis"));
        l.add(null);
        l.add(new Zmogus("Petras", "Petraitis"));
        l.add(new Zmogus("Petras", null));
        l.add(new Zmogus(null, "Petraitis"));
        l.add(new Zmogus("Antanas", "Antanaitis"));
        l.add(new Zmogus("Jonas", "Petraitis"));
        l.add(new Zmogus("Jonas", null));
        l.add(new Zmogus("Jonas", null));
        l.add(new Zmogus("Jonas", "Antanaitis"));
        l.add(null);
        l.add(new Zmogus("Antanas", "Petraitis"));
        l.add(new Zmogus("Petras", "Jonaitis"));
        l.add(new Zmogus(null, "Jonaitis"));
        
        printList(l);
 
        class PagalVardaDidejimas implements Comparator<Zmogus> {

            @Override
            public int compare(Zmogus o1, Zmogus o2) {
//                System.out.println(o1 + " lyginam su " + o2);
                if (o1 == null) {
                    if (o2 == null) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    if (o2 == null) {
                        return -1;
                    } else {
                        if (o1.getVardas() == null) {
                            if (o2.getVardas() == null) {
                                return 0;
                            } else {
                                return 1;
                            }
                        } else {
                            if (o2.getVardas() == null) {
                                return -1;
                            } else {
                                return o1.getVardas().compareTo(o2.getVardas());
                            }
                        }
                    }
                }
            }
        }
        
        l.sort(new PagalVardaDidejimas());
        
        printList(l);
 
        class PagalVardaPavardeDidejimas implements Comparator<Zmogus> {

            @Override
            public int compare(Zmogus o1, Zmogus o2) {
//                System.out.println(o1 + " lyginam su " + o2);
                if (o1 == null) {
                    if (o2 == null) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    if (o2 == null) {
                        return -1;
                    } else {
                        if (o1.getVardas() == null) {
                            if (o2.getVardas() == null) {
                                return 0;
                            } else {
                                return 1;
                            }
                        } else {
                            if (o2.getVardas() == null) {
                                return -1;
                            } else {
                                int vardaiLygus = o1.getVardas().compareTo(o2.getVardas());
                                if (vardaiLygus == 0) {
                                    if (o1.getPavarde()== null) {
                                        if (o2.getPavarde()== null) {
                                            return 0;
                                        } else {
                                            return 1;
                                        }
                                    } else {
                                        if (o2.getPavarde()== null) {
                                            return -1;
                                        } else {
                                            return o1.getPavarde().compareTo(o2.getPavarde());
                                        }
                                    }
                                } else {
                                    return vardaiLygus;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        l.sort(new PagalVardaPavardeDidejimas());
        
        printList(l);
        
        l.sort(new Comparator<Zmogus>() {
            @Override
            public int compare(Zmogus o1, Zmogus o2) {
//                System.out.println(o1 + " lyginam su " + o2);
                if (o1 == null) {
                    if (o2 == null) {
                        return 0;
                    } else {
                        return -1;
                    }
                } else {
                    if (o2 == null) {
                        return 1;
                    } else {
                        if (o1.getPavarde()== null) {
                            if (o2.getPavarde()== null) {
                                return 0;
                            } else {
                                return -1;
                            }
                        } else {
                            if (o2.getPavarde()== null) {
                                return 1;
                            } else {
                                return o2.getPavarde().compareTo(o1.getPavarde());
                            }
                        }
                    }
                }
            }
        });
        
        printList(l);
        
        l.sort(new Comparator<Zmogus>() {
            @Override
            public int compare(Zmogus o1, Zmogus o2) {
//                System.out.println(o1 + " lyginam su " + o2);
                if (o1 == null) {
                    if (o2 == null) {
                        return 0;
                    } else {
                        return -1;
                    }
                } else {
                    if (o2 == null) {
                        return 1;
                    } else {
                        if (o1.getPavarde()== null) {
                            if (o2.getPavarde()== null) {
                                return 0;
                            } else {
                                return -1;
                            }
                        } else {
                            if (o2.getPavarde()== null) {
                                return 1;
                            } else {
                                int pavardesLygios = o2.getPavarde().compareTo(o1.getPavarde());
                                if (pavardesLygios == 0) {
                                    if (o1.getVardas() == null) {
                                        if (o2.getVardas() == null) {
                                            return 0;
                                        } else {
                                            return -1;
                                        }
                                    } else {
                                        if (o2.getVardas() == null) {
                                            return 1;
                                        } else {
                                            return o2.getVardas().compareTo(o1.getVardas());
                                        }
                                    }
                                } else {
                                    return pavardesLygios;
                                }
                            }
                        }
                    }
                }
            }
        });
        
        printList(l);
        
        l.sort(new Comparator<Zmogus>() {
            @Override
            public int compare(Zmogus o1, Zmogus o2) {
//                System.out.println(o1 + " lyginam su " + o2);
                if (o1 == null) {
                    if (o2 == null) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    if (o2 == null) {
                        return -1;
                    }
                    int z1 = (o1.getVardas() == null) ? 0 : o1.getVardas().length();
                    z1 += (o1.getPavarde()== null) ? 0 : o1.getPavarde().length();
                    int z2 = (o2.getVardas() == null) ? 0 : o2.getVardas().length();
                    z2 += (o2.getPavarde()== null) ? 0 : o2.getPavarde().length();
                    return z1 - z2;
                }
            }
        });
        
        printList(l);
        

     */
