package livingCreatures;

import enums.Locations;
import enums.Rarity;
import exceptions.GetEnemyException;
import livingCreatures.Cave.*;
import livingCreatures.Forest.*;
import livingCreatures.Mewt.*;
import livingCreatures.Ponyville.*;
import livingCreatures.Road.*;
import livingCreatures.Waterfall.*;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class AllEnemies {
    private Queue<ALivingCreatures> allEnemies = new PriorityBlockingQueue<>();

    public AllEnemies(){
        this.addEnemy(new Bat());
        this.addEnemy(new Batman());
        this.addEnemy(new Mole());
        this.addEnemy(new Spider());
        this.addEnemy(new StoneBlock());
        this.addEnemy(new Vampire());
        this.addEnemy(new Cactus());
        this.addEnemy(new Dwarf());
        this.addEnemy(new Elf());
        this.addEnemy(new EvilBush());
        this.addEnemy(new Floret());
        this.addEnemy(new OliverTree());
        this.addEnemy(new CatThief());
        this.addEnemy(new CatWithManicure());
        this.addEnemy(new Kitten());
        this.addEnemy(new RoughCat());
        this.addEnemy(new WoolBall());
        this.addEnemy(new Alicorn());
        this.addEnemy(new LiveHorseshoe());
        this.addEnemy(new Pegasus());
        this.addEnemy(new RoughPony());
        this.addEnemy(new Unicorn());
        this.addEnemy(new Cart());
        this.addEnemy(new Cyclops());
        this.addEnemy(new Goblin());
        this.addEnemy(new Human());
        this.addEnemy(new Mud());
        this.addEnemy(new Ogre());
        this.addEnemy(new ButterflyWithAKnife());
        this.addEnemy(new Fairy());
        this.addEnemy(new FearsomeFrog());
        this.addEnemy(new FlyingFish());
        this.addEnemy(new Hydra());
        this.addEnemy(new IceGolem());
        this.addEnemy(new Guard(Locations.PONYVILLE));
        this.addEnemy(new Guard(Locations.MEWT));

    }

    public AllEnemies(AllEnemies allEnemies){
        this.allEnemies = allEnemies.allEnemies;
    }

    public void addEnemy(ALivingCreatures enemy){
        this.allEnemies.offer(enemy);
    }

    public ALivingCreatures getEnemy(String enemyId) throws GetEnemyException {
        for(ALivingCreatures enemy : allEnemies){
            if(enemy.getId().equals(enemyId)){
                return enemy;
            }
        }
        throw new GetEnemyException();
    }

    public AllEnemies filterByLocation(Locations location){
        AllEnemies buf = new AllEnemies(this);
        for(ALivingCreatures enemy : buf.allEnemies){
            if(!enemy.getLocations().equals(location)){
                buf.allEnemies.remove(enemy);
            }
        }
        return buf;
    }

    public AllEnemies filterByRarity(Rarity rarity){
        AllEnemies buf = new AllEnemies(this);
        for(ALivingCreatures enemy : buf.allEnemies){
            if(!enemy.getRarity().equals(rarity)){
                buf.allEnemies.remove(enemy);
            }
        }
        return buf;
    }


    public ALivingCreatures getRandomEnemy(){
        AllEnemies buf = new AllEnemies(this);
        int kol = buf.allEnemies.size();
        for(int i=0;i<(int)(Math.floor(Math.random()*(kol-1)));i++){
            buf.allEnemies.poll();
        }
        return buf.allEnemies.poll();
    }

}
